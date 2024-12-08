package com.eimantasurbonas.domain.di

import com.eimantasurbonas.domain.usecase.AddNoteUseCase
import com.eimantasurbonas.domain.usecase.DeleteNoteUseCase
import com.eimantasurbonas.domain.usecase.GetNotesUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetNotesUseCase(get()) }
    factory { AddNoteUseCase(get()) }
    factory { DeleteNoteUseCase(get()) }
}