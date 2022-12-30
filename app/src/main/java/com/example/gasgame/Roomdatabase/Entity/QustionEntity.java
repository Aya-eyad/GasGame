package com.example.gasgame.Roomdatabase.Entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = LevelEntity.class, parentColumns = {"numOfStage"},
        childColumns = {"level_no"}, onUpdate = ForeignKey.CASCADE, onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = PatternEntity.class, parentColumns = {"number"}, childColumns = {"pattern_id"},
                onUpdate = ForeignKey.CASCADE, onDelete = ForeignKey.CASCADE)})
public class QustionEntity {
    @PrimaryKey
    int id;
    String title;
    String answer_1;
    String answer_2;
    String answer_3;
    String answer_4;
    String true_answer;
    int points;
    int duration;
    String hint;
    int pattern_id;
    int level_no;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer_1() {
        return answer_1;
    }

    public void setAnswer_1(String answer_1) {
        this.answer_1 = answer_1;
    }

    public String getAnswer_2() {
        return answer_2;
    }

    public void setAnswer_2(String answer_2) {
        this.answer_2 = answer_2;
    }

    public String getAnswer_3() {
        return answer_3;
    }

    public void setAnswer_3(String answer_3) {
        this.answer_3 = answer_3;
    }

    public String getAnswer_4() {
        return answer_4;
    }

    public void setAnswer_4(String answer_4) {
        this.answer_4 = answer_4;
    }

    public String getTrue_answer() {
        return true_answer;
    }

    public void setTrue_answer(String true_answer) {
        this.true_answer = true_answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getPattern_id() {
        return pattern_id;
    }

    public void setPattern_id(int pattern_id) {
        this.pattern_id = pattern_id;
    }

    public int getLevel_no() {
        return level_no;
    }

    public void setLevel_no(int level_no) {
        this.level_no = level_no;
    }

    public QustionEntity( String title, String answer_1, String answer_2,
                         String answer_3, String answer_4, String true_answer
            , int points, int duration, String hint) {

        this.title = title;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.answer_4 = answer_4;
        this.true_answer = true_answer;
        this.points = points;
        this.duration = duration;
        this.hint = hint;

    }
}
