package com.ghost.catatanku.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ghost.catatanku.ui.components.NoteCard
import com.ghost.catatanku.ui.viewmodel.NoteViewModel

@Composable
fun NoteScreen(viewModel: NoteViewModel, modifier: Modifier = Modifier, onNoteClick: (String) -> Unit) {
    val notes = viewModel.notes.value


    LazyColumn(

        modifier = modifier.padding(16.dp).statusBarsPadding()
    ) {
        items(notes) { note ->
            NoteCard(
                note = note,
                onClick = {
                    onNoteClick(note.id)
                } // kosong dulu, nanti diisi navController
            )
        }
    }
}