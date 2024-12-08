package com.eimantasurbonas.cleanarchnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.eimantasurbonas.cleanarchnotes.theme.CleanArchNotesTheme
import com.eimantasurbonas.notes.ui.NotesScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CleanArchNotesTheme {
                NotesScreen()
            }
        }
    }
}