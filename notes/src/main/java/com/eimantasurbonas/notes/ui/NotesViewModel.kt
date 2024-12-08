package com.eimantasurbonas.notes.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eimantasurbonas.domain.usecase.AddNoteUseCase
import com.eimantasurbonas.domain.usecase.DeleteNoteUseCase
import com.eimantasurbonas.domain.usecase.GetNotesUseCase
import com.eimantasurbonas.notes.mapper.toPresentation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NotesViewModel(
    private val getNotesUseCase: GetNotesUseCase,
    private val addNoteUseCase: AddNoteUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase,
) : ViewModel() {
    private val _uiState = MutableStateFlow(NotesUiState())
    val uiState: StateFlow<NotesUiState> = _uiState.asStateFlow()

    init {
        getNotes()
    }

    private fun getNotes() {
        viewModelScope.launch {
            val notes = getNotesUseCase().map { it.toPresentation() }
            _uiState.update { it.copy(notes = notes) }
        }
    }

    fun onAddDialogShow() {
        _uiState.update { it.copy(isAddDialogVisible = true) }
    }

    fun onAddDialogDismiss() {
        _uiState.update { it.copy(isAddDialogVisible = false) }
    }

    fun addNote(title: String, content: String) {
        viewModelScope.launch {
            addNoteUseCase(title, content)
            getNotes()
            onAddDialogDismiss()
        }
    }

    fun deleteNote(noteId: String) {
        viewModelScope.launch {
            deleteNoteUseCase(noteId)
            getNotes()
        }
    }
}