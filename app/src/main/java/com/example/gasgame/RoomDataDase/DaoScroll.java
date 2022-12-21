package com.example.gasgame.RoomDataDase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;
@Dao
 public interface DaoScroll {
 @Insert
 void insertScroll(EntityScroll scroll);
 @Delete
 void deletScroll(EntityScroll scroll);
 @Update
 void updateScroll(EntityScroll scroll);
}
