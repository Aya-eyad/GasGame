package com.example.gasgame.RoomDataDase.Entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
//بيانات الالغاز
@Entity(foreignKeys = {@ForeignKey(entity = EntityPuzzleData.class
        ,parentColumns = {"numOfPuzzle"},
        childColumns = {"    public int numberOfPattern;\n"},
        onDelete = ForeignKey.CASCADE,onUpdate = ForeignKey.CASCADE)})
public class EntityScroll {
    @PrimaryKey
    int numOfPuzzle;
    String puzzletext;
    String answer1;
    String answer2;
    String answer3;
    String answer4;
    String correctanswer;
    int numOfCollectedpoints;
    public int numStage;
    int time;
    String questionpattern;
    String instructionaltext;


    public EntityScroll(int numOfPuzzle, String puzzletext,
                        String answer1, String answer2, String answer3,
                        String answer4, String correctanswer, int numOfCollectedpoints
           int time , int duration, String instructionaltext) {
        this.numOfPuzzle = numOfPuzzle;
        this.puzzletext = puzzletext;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctanswer = correctanswer;
        this.numOfCollectedpoints = numOfCollectedpoints;
        this.time=time;
        this.instructionaltext = instructionaltext;

    }

    public EntityScroll() {
    }
    public int getNumOfPuzzle() {
        return numOfPuzzle;
    }
    public void setNumOfPuzzle(int numOfPuzzle) {
        this.numOfPuzzle = numOfPuzzle;
    }
    public String getPuzzletext() {
        return puzzletext;
    }
    public void setPuzzletext(String puzzletext) {
        this.puzzletext = puzzletext;
    }
    public String getAnswer1() {
        return answer1;
    }
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }
    public String getAnswer2() {
        return answer2;
    }
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
    public String getAnswer3() {
        return answer3;
    }
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }
    public String getAnswer4() {
        return answer4;
    }
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }
    public String getCorrectanswer() {
        return correctanswer;
    }
    public void setCorrectanswer(String correctanswer) {
        this.correctanswer = correctanswer;
    }
    public int getNumOfCollectedpoints() {
        return numOfCollectedpoints;
    }
    public void setNumOfCollectedpoints(int numOfCollectedpoints) {
        this.numOfCollectedpoints = numOfCollectedpoints;
    }
    public int getNumOfStage() {
        return numStage;
    }
    public void setNumOfStage(int numOfStage) {
        this.numStage = numOfStage;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public String getQuestionpattern() {
        return questionpattern;
    }
    public void setQuestionpattern(String questionpattern) {
        this.questionpattern = questionpattern;
    }
    public String getInstructionaltext() {
        return instructionaltext;
    }
    public void setInstructionaltext(String instructionaltext) {
        this.instructionaltext = instructionaltext;
    }
}
