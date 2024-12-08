package com.eimantasurbonas.data.mapper

import com.eimantasurbonas.data.model.NoteDto
import com.eimantasurbonas.domain.model.NoteBo

fun NoteDto.toDomain() = NoteBo(
    id = id,
    title = title,
    content = content,
    timestamp = timestamp
)

fun NoteBo.toDto() = NoteDto(
    id = id,
    title = title,
    content = content,
    timestamp = timestamp
)