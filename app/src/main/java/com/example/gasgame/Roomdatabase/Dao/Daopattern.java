package com.example.gasgame.Roomdatabase.Dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.example.gasgame.Roomdatabase.Entity.PatternEntity;

@Dao
public interface Daopattern {
    @Insert
    void insertpattern(PatternEntity patternEntity);
    @Delete
    void deletpattern(PatternEntity patternEntity);
    @Update
    void updatepattern(PatternEntity patternEntity);

}
