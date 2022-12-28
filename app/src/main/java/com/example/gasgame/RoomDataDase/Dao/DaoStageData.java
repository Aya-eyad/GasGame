package com.example.gasgame.RoomDataDase.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.gasgame.RoomDataDase.Entity.EntityIformationPerson;
import com.example.gasgame.RoomDataDase.Entity.EntityStageData;

import java.util.List;

@Dao
public interface DaoStageData {
    @Insert
    void insertStageData(EntityStageData stageData);
    @Delete
    void deletStageData(EntityStageData stageData);
    @Update
    void updateStageData(EntityStageData stageData);
@Query("select * from EntityStageData")
LiveData<List<EntityStageData>> getallstagedata();

}
