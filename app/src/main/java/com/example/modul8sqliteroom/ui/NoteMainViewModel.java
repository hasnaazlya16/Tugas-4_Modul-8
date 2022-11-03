package com.example.modul8sqliteroom.ui;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.example.modul8sqliteroom.database.Note;
import com.example.modul8sqliteroom.repository.NoteRepository;
import java.util.List;

public class NoteMainViewModel extends ViewModel {
    private final NoteRepository mNoteRepository;
    public NoteMainViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }
    LiveData<List<Note>> getAllNotes() {
        return mNoteRepository.getAllNotes();
    }
}