package com.example.gasgame.Roomdatabase;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.gasgame.Roomdatabase.Dao.DaoInformation;
import com.example.gasgame.Roomdatabase.Dao.Daolevel;
import com.example.gasgame.Roomdatabase.Dao.Daopattern;
import com.example.gasgame.Roomdatabase.Dao.Daoqustion;
import com.example.gasgame.Roomdatabase.Entity.IformationEntiry;
import com.example.gasgame.Roomdatabase.Entity.LevelEntity;
import com.example.gasgame.Roomdatabase.Entity.PatternEntity;
import com.example.gasgame.Roomdatabase.Entity.QustionEntity;

import java.util.List;

public class Reposetry {
    Daopattern daopattern;
    DaoInformation daoInformationPerson;
    Daolevel daolevel;
    Daoqustion daoqustion;
    public Reposetry(Application application){

MyRoomDatabase myRoomDatabase= MyRoomDatabase.getDatabase(application);
daopattern=myRoomDatabase.daopattern();
daoInformationPerson=myRoomDatabase.daoInformation();
daoqustion=myRoomDatabase.daoqustion();
daolevel=myRoomDatabase.daolevel();
    }

  public   void insertpattern(PatternEntity patternEntity){
MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
    @Override
    public void run() {
        daopattern.insertpattern(patternEntity);
    }
});  }

   public void deletpattern(PatternEntity patternEntity){
       MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
           @Override
           public void run() {
               daopattern.deletpattern(patternEntity);
           }
       });

   }

   public void updatepattern(PatternEntity patternEntity){
       MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
           @Override
           public void run() {
               daopattern.updatepattern(patternEntity);
           }
       });
   };

/////////////////////////////////informationperson////////////////////////////////////

   public void insertinfoemation(IformationEntiry iformationPerson){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoInformationPerson.insertinfoemation(iformationPerson);
            }
        });
    }

   public void deletinfoemation(IformationEntiry iformationPerson){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoInformationPerson.deletinfoemation(iformationPerson);
            }
        });
    };

  public   void updateinfoemation(IformationEntiry iformationPerson){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoInformationPerson.updateinfoemation(iformationPerson);
            }
        });
    };
    LiveData< List<IformationEntiry>> getallinformation(){
        return daoInformationPerson.getallinformation();
    }
////////////////////////////level///////////////////////////////

void insertlevel(LevelEntity entitylevel){
    MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
        @Override
        public void run() {
            daolevel.insertlevel(entitylevel);

        }
    });
}

    void deletlevel(LevelEntity entitylevel){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daolevel.deletlevel(entitylevel);
            }
        });
    }

    void updatelevel(LevelEntity entitylevel){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daolevel.updatelevel(entitylevel);
            }
        });
    }
    LiveData<List<LevelEntity>> getalllevel(){
        return       daolevel.getalllevel();

    }

/////////////////////Qustion//////////////////////////

void insertqustion(QustionEntity qustionEntity){
    MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
        @Override
        public void run() {
            daoqustion.insertqustion(qustionEntity);
        }
    });
}

    void deletqustion(QustionEntity qustionEntity){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoqustion.deletqustion(qustionEntity);
            }
        });
    }

    void updatequstion(QustionEntity qustionEntity){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoqustion.updatequstion(qustionEntity);
            }
        });
    }
}
