package com.example.gasgame.RoomDataDase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
interface DaoInformationPerson {
 @Insert
 void insertinfoemation(EntityIformationPerson iformationPerson);
 @Delete
 void deletinfoemation(EntityIformationPerson iformationPerson);
 @Update
 void updateinfoemation(EntityIformationPerson iformationPerson);
 @Query("select * from  EntityIformationPerson ")
 LiveData<List<EntityIformationPerson>> getallinformation();









}


