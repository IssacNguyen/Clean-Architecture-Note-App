package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val noteUseCase: NoteUseCase
) : ViewModel() {

    private val _state = mutableStateOf(NotesState())
    val state: State<NotesState> = _state

    fun onEvent(event: NotesEvent) {
        when (event) {
            is NotesEvent.Order -> {

            }
            is NotesEvent.DeleteNote -> {

            }
            is NotesEvent.RestoreNote -> {

            }
            is NotesEvent.ToggleOrderSection -> {

            }
        }
    }

}