package com.ghost.catatanku.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ghost.catatanku.model.data.Note
import com.ghost.catatanku.ui.components.DetailCard
import com.ghost.catatanku.ui.theme.CatatanKuTheme

@Composable
fun DetailScreen(note : Note) {
    Column(
        modifier = Modifier.fillMaxSize().padding(10.dp)

    ) {
        DetailCard(note = note )
    }
}
@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    val note = Note(
        id = "a3f8c2d1",
        title = "Daftar Akun",
        content = "username: apaja\npassword: oraweruh",
        createdAt = "01 Maret 2026",
        time = "12.00"
    )

    CatatanKuTheme(darkTheme = true) {
        DetailScreen(note = note)
    }
}