package com.example.gasgame.RoomDataDase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

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


}
