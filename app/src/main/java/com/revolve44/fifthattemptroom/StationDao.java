package com.revolve44.fifthattemptroom;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface StationDao {
    @Insert
    void insert(Station station);
    @Update
    void update(Station station);
    @Delete
    void delete(Station station);

    @Query("DELETE FROM station_table")
    void deleteAllNotes();

    @Query("SELECT * FROM station_table ORDER BY priority DESC")
    LiveData<List<Station>> getAllNotes();
}