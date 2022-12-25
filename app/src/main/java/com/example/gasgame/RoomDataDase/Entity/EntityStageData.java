package com.example.gasgame.RoomDataDase.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class EntityStageData {

    @PrimaryKey
    int numOfStage;
    int numOfPointRequird;

    public int getNumOfStage() {
        return numOfStage;
    }

    public void setNumOfStage(int numOfStage) {
        this.numOfStage = numOfStage;
    }

    public int getNumOfPointRequird() {
        return numOfPointRequird;
    }

    public void setNumOfPointRequird(int numOfPointRequird) {
        this.numOfPointRequird = numOfPointRequird;
    }
}
