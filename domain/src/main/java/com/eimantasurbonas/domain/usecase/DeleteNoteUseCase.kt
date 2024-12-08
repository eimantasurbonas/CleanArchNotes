package com.eimantasurbonas.domain.usecase

import com.eimantasurbonas.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: String) {
        repository.deleteNote(id)
    }
}