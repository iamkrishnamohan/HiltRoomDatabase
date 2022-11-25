package com.example.hiltroomdatabase.repository

import com.example.hiltroomdatabase.db.NoteDao
import com.example.hiltroomdatabase.db.NoteEntity
import javax.inject.Inject

class DbRepository @Inject constructor(private val dao: NoteDao) {

    fun saveNote(note: NoteEntity) = dao.insertNote(note)
    fun updateNote(note: NoteEntity) = dao.updateNote(note)
    fun deleteNote(note: NoteEntity) = dao.deleteNote(note)
    fun getNote(id : Int) : NoteEntity = dao.getNote(id)
    fun getAllNotes() = dao.getAllNotes()

}