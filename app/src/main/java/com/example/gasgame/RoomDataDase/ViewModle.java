package com.example.gasgame.RoomDataDase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.gasgame.RoomDataDase.Entity.EntityIformationPerson;
import com.example.gasgame.RoomDataDase.Entity.EntityPuzzleData;
import com.example.gasgame.RoomDataDase.Entity.EntityScroll;
import com.example.gasgame.RoomDataDase.Entity.EntityStageData;

import java.util.List;
// تاعوoriantaion وظيفتو انو الداتا بضل متاحه حتى لو الجهاز اتغير ال
public class ViewModle extends AndroidViewModel {
    Reposetry reposetry;
    public ViewModle(@NonNull Application application) {
        super(application);
        reposetry=new Reposetry(application);
    }
    public   void insertScroll(EntityScroll scroll){
        reposetry.insertScroll(scroll);}

    public void deletScroll(EntityScroll scroll){
       reposetry.deletScroll(scroll);}

    public void updateScroll(EntityScroll scroll){
       reposetry.updateScroll(scroll);
    };

////////////////////iformationPerson///////////////////////////////


    public void insertinfoemation(EntityIformationPerson iformationPerson){
        reposetry.insertinfoemation(iformationPerson);
    }

    public void deletinfoemation(EntityIformationPerson iformationPerson){
        reposetry.deletinfoemation(iformationPerson);
    };

    public   void updateinfoemation(EntityIformationPerson iformationPerson){
       reposetry.updateinfoemation(iformationPerson);
    };
    LiveData< List<EntityIformationPerson>> getallinformation(){
        return reposetry.getallinformation();
    };
////////////////////////////////stage//////////////////////////
void insertStageData(EntityStageData stageData){
    reposetry.insertStageData(stageData);
        }

        void deletStageData(EntityStageData stageData){
        reposetry.deletStageData(stageData);

    }

    void updateStageData(EntityStageData stageData){
    reposetry.updateStageData(stageData);

    }
    LiveData<List<EntityStageData>> getallstagedata(){
        return reposetry.getallstagedata();

    }
///////////////////////////puzzle////////////////////
void insertPuzzleData(EntityPuzzleData puzzleData){
 reposetry.insertPuzzleData(puzzleData);
        }


    void deletPuzzleData(EntityPuzzleData puzzleData){
       reposetry.deletPuzzleData(puzzleData);

    }

    void updatePuzzleData(EntityPuzzleData puzzleData){
       reposetry.updatePuzzleData(puzzleData);

    }
}
