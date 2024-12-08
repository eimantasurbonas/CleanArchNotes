package com.eimantasurbonas.data.di

import com.eimantasurbonas.data.repository.NoteRepositoryImpl
import com.eimantasurbonas.data.source.DummyNotesDataSourceImpl
import com.eimantasurbonas.data.source.NotesDataSource
import com.eimantasurbonas.domain.repository.NoteRepository
import org.koin.dsl.module

val dataModule = module {
    single<NotesDataSource> { DummyNotesDataSourceImpl() }
    single<NoteRepository> { NoteRepositoryImpl(get()) }
}