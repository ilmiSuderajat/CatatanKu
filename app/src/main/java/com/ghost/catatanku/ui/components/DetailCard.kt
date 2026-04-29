package com.ghost.catatanku.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ghost.catatanku.model.data.Note
import com.ghost.catatanku.ui.theme.CatatanKuTheme

@Composable
fun DetailCard(note: Note){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    )
    {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = note.content,
                style = MaterialTheme.typography.titleMedium
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailCardPreview(){
    val note = Note(
        id = "a3f8c2d1",
        title = "Daftar Akun",
        content = "username: apaja\npassword: oraweruh",
        createdAt = "01 Maret 2026",
        time = "12.00"
    )

    CatatanKuTheme(
        darkTheme = true,
        dynamicColor = false
    ) {
        DetailCard( note = note )
    }
}
