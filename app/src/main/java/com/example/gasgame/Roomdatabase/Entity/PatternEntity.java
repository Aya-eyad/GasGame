package com.example.gasgame.Roomdatabase.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class PatternEntity {

        @PrimaryKey

       public   int number;
     public    String name;

    public PatternEntity(String name) {
        this.name = name;
    }

    public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
