package com.example.modul8sqliteroom.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;
import androidx.room.Delete;
import androidx.room.Query;
import java.util.List;

@Dao
public interface DAONote {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Note note);
    @Update()
    void update(Note note);
    @Delete()
    void delete(Note note);
    @Query("SELECT * from note ORDER BY id ASC")
    LiveData<List<Note>> getAllNotes();
}