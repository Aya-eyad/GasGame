package com.example.gasgame.RoomDataDase.Entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity (foreignKeys = {@ForeignKey(entity = EntityStageData.class
        ,parentColumns = {"numberOfPattern"},
        childColumns = {"numOfStage"},
        onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
// انماط الالغاز
public class EntityPuzzleData {
    @PrimaryKey

    public int numberOfPattern;
    public String nameOfPattern;
        int numOfStage;
    public int getNumberOfPattern() {
        return numberOfPattern;
    }

    public void setNumberOfPattern(int numberOfPattern) {
        this.numberOfPattern = numberOfPattern;
    }

    public String getNameOfPattern() {
        return nameOfPattern;
    }

    public void setNameOfPattern(String nameOfPattern) {
        this.nameOfPattern = nameOfPattern;
    }
}
