package com.example.gasgame.RoomDataDase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class EntityScroll {
    @PrimaryKey(autoGenerate = true)
    int id;
    int Collectedpoints;
    int necessarypoints;
    int totalpoint;

    public EntityScroll(int collectedpoints, int necessarypoints, int totalpoint) {
        Collectedpoints = collectedpoints;
        this.necessarypoints = necessarypoints;
        this.totalpoint = totalpoint;
    }

    public EntityScroll() {
    }

    public int getCollectedpoints() {
        return Collectedpoints;
    }

    public void setCollectedpoints(int collectedpoints) {
        Collectedpoints = collectedpoints;
    }

    public int getNecessarypoints() {
        return necessarypoints;
    }

    public void setNecessarypoints(int necessarypoints) {
        this.necessarypoints = necessarypoints;
    }

    public int getTotalpoint() {
        return totalpoint;
    }

    public void setTotalpoint(int totalpoint) {
        this.totalpoint = totalpoint;
    }
}
