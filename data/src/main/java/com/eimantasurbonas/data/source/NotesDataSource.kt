package com.eimantasurbonas.data.source

import com.eimantasurbonas.data.model.NoteDto

interface NotesDataSource {
    suspend fun getNotes(): List<NoteDto>
    suspend fun insertNote(note: NoteDto)
    suspend fun deleteNote(id: String)
}