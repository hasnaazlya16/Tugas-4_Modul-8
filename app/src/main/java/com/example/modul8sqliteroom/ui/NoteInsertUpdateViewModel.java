package com.example.modul8sqliteroom.ui;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import com.example.modul8sqliteroom.database.Note;
import com.example.modul8sqliteroom.repository.NoteRepository;

public class NoteInsertUpdateViewModel extends ViewModel {
    private final NoteRepository mNoteRepository;
    public NoteInsertUpdateViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }
    public void insert(Note note) {
        mNoteRepository.insert(note);
    }
    public void update(Note note) {
        mNoteRepository.update(note);
    }
    public void delete(Note note) {
        mNoteRepository.delete(note);
    }
}