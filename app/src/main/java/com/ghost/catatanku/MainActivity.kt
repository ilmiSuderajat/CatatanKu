package com.ghost.catatanku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ghost.catatanku.ui.navigation.NavGraph
import com.ghost.catatanku.ui.theme.CatatanKuTheme
import com.ghost.catatanku.ui.viewmodel.NoteViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CatatanKuTheme {
                val viewModel : NoteViewModel = viewModel()
                        NavGraph(viewModel = viewModel)
                }
            }
        }
    }

