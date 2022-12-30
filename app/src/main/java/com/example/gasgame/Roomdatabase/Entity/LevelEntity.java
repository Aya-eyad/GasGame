package com.example.gasgame.Roomdatabase.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class LevelEntity {


        @PrimaryKey
        int numOfStage;
        int numOfPointRequird;

    public LevelEntity(int numOfStage, int numOfPointRequird) {
        this.numOfStage = numOfStage;
        this.numOfPointRequird = numOfPointRequird;
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

