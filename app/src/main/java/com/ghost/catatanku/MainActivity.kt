package com.ghost.catatanku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.ghost.catatanku.ui.screen.NoteScreen
import com.ghost.catatanku.ui.theme.CatatanKuTheme
import com.ghost.catatanku.ui.viewmodel.NoteViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CatatanKuTheme {
                Scaffold{ paddingValues ->
                    NoteScreen(modifier = Modifier.padding(paddingValues), viewModel = NoteViewModel())
                }
            }
        }
    }
}
