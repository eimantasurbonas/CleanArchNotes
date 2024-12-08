package com.eimantasurbonas.domain.usecase

import com.eimantasurbonas.domain.model.NoteBo
import com.eimantasurbonas.domain.repository.NoteRepository

class GetNotesUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(): List<NoteBo> {
        return repository.getNotes()
    }
}