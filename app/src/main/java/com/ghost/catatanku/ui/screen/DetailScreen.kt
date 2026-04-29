package com.ghost.catatanku.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ghost.catatanku.ui.components.DetailCard
import com.ghost.catatanku.ui.theme.CatatanKuTheme
import com.ghost.catatanku.ui.viewmodel.NoteViewModel

@Composable
fun DetailScreen(viewModel: NoteViewModel) {
    val notes = viewModel.notes.value

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,


    ){
        items(notes) { note ->
            DetailCard(note = note)
        }
    }


}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview(){
    CatatanKuTheme(
        darkTheme = true,
        dynamicColor = false
    ) {
        DetailScreen(viewModel = NoteViewModel())

    }
}