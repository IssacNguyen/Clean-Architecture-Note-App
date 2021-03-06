package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NoteUseCase(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNote: AddNote,
    val getNote : GetNoteUseCase
)