package com.eimantasurbonas.notes.di

import com.eimantasurbonas.notes.ui.NotesViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val notesModule = module {
    viewModel { NotesViewModel(get(), get(), get()) }
}