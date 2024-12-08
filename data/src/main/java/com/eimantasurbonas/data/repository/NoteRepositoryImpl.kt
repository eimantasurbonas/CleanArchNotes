package com.eimantasurbonas.data.repository

import com.eimantasurbonas.data.mapper.toDomain
import com.eimantasurbonas.data.mapper.toDto
import com.eimantasurbonas.data.source.NotesDataSource
import com.eimantasurbonas.domain.model.NoteBo
import com.eimantasurbonas.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val dataSource: NotesDataSource
) : NoteRepository {

    override suspend fun getNotes(): List<NoteBo> {
        return dataSource.getNotes().map { it.toDomain() }
    }

    override suspend fun insertNote(noteBo: NoteBo) {
        dataSource.insertNote(noteBo.toDto())
    }

    override suspend fun deleteNote(id: String) {
        dataSource.deleteNote(id)
    }
}