package com.example.gasgame.RoomDataDase;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

@Entity
@TypeConverters({DateConverter.class})
public class EntityIformationPerson {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String email;
    int password;
    String county;
    boolean Gender;
    Date birthdate;

    public EntityIformationPerson() {
    }

    public EntityIformationPerson(String name,
                                  String email, int password, String county,
                                  boolean gender, Date birthdate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.county = county;
        Gender = gender;
        this.birthdate = birthdate;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
