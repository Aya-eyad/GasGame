package com.example.gasgame.Model;

import java.util.ArrayList;

public class level2 {
    int level_no;
    int unlock_points;
    ArrayList<Questionslevel2> questionslevel2;

    public int getLevel_no() {
        return level_no;
    }

    public void setLevel_no(int level_no) {
        this.level_no = level_no;
    }

    public int getUnlock_points() {
        return unlock_points;
    }

    public void setUnlock_points(int unlock_points) {
        this.unlock_points = unlock_points;
    }

    public ArrayList<Questionslevel2> getQuestionslevel2() {
        return questionslevel2;
    }

    public void setQuestionslevel2(ArrayList<Questionslevel2> questionslevel2) {
        this.questionslevel2 = questionslevel2;
    }
}
