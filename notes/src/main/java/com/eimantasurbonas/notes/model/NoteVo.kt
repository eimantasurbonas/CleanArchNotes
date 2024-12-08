package com.eimantasurbonas.notes.model

data class NoteVo(
    val id: String,
    val title: String,
    val content: String,
    val formattedTimestamp: String
)