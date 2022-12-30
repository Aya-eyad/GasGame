package com.example.gasgame.Roomdatabase.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.gasgame.Roomdatabase.Entity.IformationEntiry;

import java.util.List;

@Dao
public
interface DaoInformation {
 @Insert
 void insertinfoemation(IformationEntiry iformationPerson);
 @Delete
 void deletinfoemation(IformationEntiry iformationPerson);
 @Update
 void updateinfoemation(IformationEntiry iformationPerson);
 @Query("select * from  IformationEntiry ")
 LiveData<List<IformationEntiry>> getallinformation();









}


