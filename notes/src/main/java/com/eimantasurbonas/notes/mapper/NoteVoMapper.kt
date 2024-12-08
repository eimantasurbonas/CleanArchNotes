package com.eimantasurbonas.notes.mapper

import com.eimantasurbonas.domain.model.NoteBo
import com.eimantasurbonas.notes.model.NoteVo
import java.text.DateFormat
import java.util.Date

fun NoteBo.toPresentation() = NoteVo(
    id = id,
    title = title,
    content = content,
    formattedTimestamp = formatTimestamp(timestamp)
)

private fun formatTimestamp(timestamp: Long): String {
    return DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT)
        .format(Date(timestamp))
}
