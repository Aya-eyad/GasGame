package com.example.gasgame.RoomDataDase.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity//بيانات المرحله
public class EntityStageData {

    @PrimaryKey
    int numOfStage;
    int numOfPointRequird;
    int minimum;

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

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
