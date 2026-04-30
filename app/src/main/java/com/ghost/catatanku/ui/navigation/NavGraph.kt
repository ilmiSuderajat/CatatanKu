package com.ghost.catatanku.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ghost.catatanku.ui.screen.DetailScreen
import com.ghost.catatanku.ui.screen.NoteScreen
import com.ghost.catatanku.ui.viewmodel.NoteViewModel

@Composable
fun NavGraph(viewModel: NoteViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "notes"
    ) {
        composable("notes") {
            NoteScreen(
                viewModel = viewModel,
                onNoteClick = { id ->
                    navController.navigate("detail/$id")
                }
            )
        }

        composable("detail/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")
            val note = viewModel.notes.value.find { it.id == id }
            if (note != null) {
                DetailScreen(note = note)
            }
        }
    }
}