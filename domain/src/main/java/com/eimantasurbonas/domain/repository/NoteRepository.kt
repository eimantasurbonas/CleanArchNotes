package com.eimantasurbonas.domain.repository

import com.eimantasurbonas.domain.model.NoteBo

interface NoteRepository {
    suspend fun getNotes(): List<NoteBo>
    suspend fun insertNote(noteBo: NoteBo)
    suspend fun deleteNote(id: String)
}