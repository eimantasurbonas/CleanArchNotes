package com.eimantasurbonas.domain.usecase

import com.eimantasurbonas.domain.model.NoteBo
import com.eimantasurbonas.domain.repository.NoteRepository
import java.util.UUID

class AddNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(title: String, content: String) {
        val noteBo = NoteBo(
            id = UUID.randomUUID().toString(),
            title = title,
            content = content,
            timestamp = System.currentTimeMillis()
        )
        repository.insertNote(noteBo)
    }
}