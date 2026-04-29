package com.ghost.catatanku.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ghost.catatanku.model.data.Note
import androidx.compose.runtime.State
class NoteViewModel : ViewModel() {

    private val _notes = mutableStateOf<List<Note>>(emptyList())
    val notes: State<List<Note>> = _notes

    init {
        loadNotes()
    }

    private fun loadNotes() {
        _notes.value = listOf(
            Note(
                id = "a3f8c2d1",
                title = "Daftar Akun",
                content = "username: apaja\npassword: oraweruh",
                createdAt = "01 Maret 2026",
                time = "12.00"
            ),
            Note(
                id = "b4c9d3e2",
                title = "Belanja Besok",
                content = "- Indomie\n- Telur\n- Kopi",
                createdAt = "02 Maret 2026",
                time = "09.30"
            )
        )
    }
}