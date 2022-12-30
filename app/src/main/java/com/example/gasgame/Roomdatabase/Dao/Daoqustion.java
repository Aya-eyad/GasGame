package com.example.gasgame.Roomdatabase.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.gasgame.Roomdatabase.Entity.QustionEntity;

import java.util.List;

@Dao
public interface Daoqustion {
    @Insert
    void insertqustion(QustionEntity qustionEntity);
    @Delete
    void deletqustion(QustionEntity qustionEntity);
    @Update
    void updatequstion(QustionEntity qustionEntity);
//    @Query("select * from Quastion where level_no = :level_no & pattern_id = :pattern_id")
//    LiveData<List<QustionEntity>> getallquastion(int level_no , int pattern_id);
//    @Query("select * from Quastion where pattern_id = :pattern_id")
//    LiveData<List<QustionEntity>> getallquastion( int pattern_id);
    @Query("select * from QustionEntity")
    LiveData<List<QustionEntity>>getallquastion();

}
