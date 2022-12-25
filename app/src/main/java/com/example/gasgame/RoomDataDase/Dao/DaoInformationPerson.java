package com.example.gasgame.RoomDataDase.Dao;

import android.content.Entity;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.gasgame.RoomDataDase.Entity.EntityIformationPerson;

import java.util.List;
@Dao
public
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


