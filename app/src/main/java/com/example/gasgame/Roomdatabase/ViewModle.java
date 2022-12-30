package com.example.gasgame.Roomdatabase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.gasgame.Roomdatabase.Entity.IformationEntiry;
import com.example.gasgame.Roomdatabase.Entity.LevelEntity;
import com.example.gasgame.Roomdatabase.Entity.PatternEntity;
import com.example.gasgame.Roomdatabase.Entity.QustionEntity;

import java.util.List;
// تاعوoriantaion وظيفتو انو الداتا بضل متاحه حتى لو الجهاز اتغير ال
public class ViewModle extends AndroidViewModel {
    Reposetry reposetry;
    public ViewModle(@NonNull Application application) {
        super(application);
        reposetry=new Reposetry(application);
    }
    public   void insertpattern(PatternEntity patternEntity){
        reposetry.insertpattern(patternEntity);}

    public void deletpattern(PatternEntity patternEntity){
       reposetry.deletpattern(patternEntity);}

    public void updatepattern(PatternEntity patternEntity){
       reposetry.updatepattern(patternEntity);
    };

////////////////////iformationPerson///////////////////////////////


    public void insertinfoemation(IformationEntiry iformationPerson){
        reposetry.insertinfoemation(iformationPerson);
    }

    public void deletinfoemation(IformationEntiry iformationPerson){
        reposetry.deletinfoemation(iformationPerson);
    };

    public   void updateinfoemation(IformationEntiry iformationPerson){
       reposetry.updateinfoemation(iformationPerson);
    };
    LiveData< List<IformationEntiry>> getallinformation(){
        return reposetry.getallinformation();
    };
////////////////////////////////level//////////////////////////
public void insertlevel(LevelEntity entitylevel){
    reposetry.insertlevel(entitylevel);
        }

        void deletlevel(LevelEntity entitylevel){
        reposetry.deletlevel(entitylevel);

    }

    public void updatelevel(LevelEntity entitylevel){
    reposetry.updatelevel(entitylevel);

    }
   public LiveData<List<LevelEntity>> getalllevel(){
        return reposetry.getalllevel();

    }
///////////////////////////puzzle////////////////////
   public void insertqustion(QustionEntity qustionEntity){
 reposetry.insertqustion(qustionEntity);
        }


    public void deletqustion(QustionEntity qustionEntity){
       reposetry.deletqustion(qustionEntity);

    }

    public void updatequstion(QustionEntity qustionEntity){
       reposetry.updatequstion(qustionEntity);

    }
}
