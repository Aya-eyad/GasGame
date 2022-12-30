package com.example.gasgame.Roomdatabase.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.gasgame.Roomdatabase.Entity.LevelEntity;

import java.util.List;

@Dao
public interface Daolevel {
    @Insert
    void insertlevel(LevelEntity entitylevel);
    @Delete
    void deletlevel(LevelEntity entitylevel);
    @Update
    void updatelevel(LevelEntity entitylevel);
@Query("select * from LevelEntity")
LiveData<List<LevelEntity>> getalllevel();

}
