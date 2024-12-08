package com.eimantasurbonas.data.source

import com.eimantasurbonas.data.model.NoteDto

class DummyNotesDataSourceImpl : NotesDataSource {
    private val mockNotes = mutableListOf(
        NoteDto(
            id = "1",
            title = "Shopping List",
            content = "1. Milk\n2. Eggs\n3. Bread",
            timestamp = System.currentTimeMillis() - 86400000
        ),
        NoteDto(
            id = "2",
            title = "Meeting Notes",
            content = "Discuss project timeline and requirements",
            timestamp = System.currentTimeMillis() - 172800000
        ),
        NoteDto(
            id = "3",
            title = "Ideas",
            content = "App features:\n- Dark mode\n- Cloud sync\n- Widgets",
            timestamp = System.currentTimeMillis()
        )
    )

    override suspend fun getNotes(): List<NoteDto> {
        return mockNotes
    }

    override suspend fun insertNote(note: NoteDto) {
        mockNotes.add(note)
    }

    override suspend fun deleteNote(id: String) {
        mockNotes.removeIf { it.id == id }
    }
}