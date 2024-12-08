package com.eimantasurbonas.cleanarchnotes

import android.app.Application
import com.eimantasurbonas.data.di.dataModule
import com.eimantasurbonas.domain.di.domainModule
import com.eimantasurbonas.notes.di.notesModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NotesApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@NotesApplication)
            modules(
                notesModule,
                domainModule,
                dataModule
            )
        }
    }
}