package com.example.gasgame.RoomDataDase.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.gasgame.RoomDataDase.Entity.EntityIformationPerson;
import com.example.gasgame.RoomDataDase.Entity.EntityPuzzleData;

import java.util.List;
@Dao
public interface DaoPuzzleData {
    @Insert
    void insertPuzzleData(EntityPuzzleData puzzleData);
    @Delete
    void deletPuzzleData(EntityPuzzleData puzzleData);
    @Update
    void updatePuzzleData(EntityPuzzleData puzzleData);

}
