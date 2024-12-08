package com.eimantasurbonas.notes.ui

import com.eimantasurbonas.notes.model.NoteVo

data class NotesUiState(
    val notes: List<NoteVo> = emptyList(),
    val isAddDialogVisible: Boolean = false
)