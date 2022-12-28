package com.example.gasgame.RoomDataDase;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.example.gasgame.RoomDataDase.Dao.DaoInformationPerson;
import com.example.gasgame.RoomDataDase.Dao.DaoPuzzleData;
import com.example.gasgame.RoomDataDase.Dao.DaoScroll;
import com.example.gasgame.RoomDataDase.Dao.DaoStageData;
import com.example.gasgame.RoomDataDase.Entity.EntityIformationPerson;
import com.example.gasgame.RoomDataDase.Entity.EntityPuzzleData;
import com.example.gasgame.RoomDataDase.Entity.EntityScroll;
import com.example.gasgame.RoomDataDase.Entity.EntityStageData;

import java.util.List;

public class Reposetry {
    DaoScroll daoScroll;
    DaoInformationPerson daoInformationPerson;
    DaoStageData daoStageData;
    DaoPuzzleData daoPuzzleData;
    public Reposetry(Application application){

MyRoomDatabase myRoomDatabase= MyRoomDatabase.getDatabase(application);
daoScroll=myRoomDatabase.daoScroll();
daoInformationPerson=myRoomDatabase.daoInformationPerson();
daoPuzzleData=myRoomDatabase.daoPuzzleData();
daoStageData=myRoomDatabase.daoStageData();
    }

  public   void insertScroll(EntityScroll scroll){
MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
    @Override
    public void run() {
        daoScroll.insertScroll(scroll);
    }
});  }

   public void deletScroll(EntityScroll scroll){
       MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
           @Override
           public void run() {
               daoScroll.deletScroll(scroll);
           }
       });

   }

   public void updateScroll(EntityScroll scroll){
       MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
           @Override
           public void run() {
               daoScroll.updateScroll(scroll);
           }
       });
   };

/////////////////////////////////informationperson////////////////////////////////////

   public void insertinfoemation(EntityIformationPerson iformationPerson){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoInformationPerson.insertinfoemation(iformationPerson);
            }
        });
    }

   public void deletinfoemation(EntityIformationPerson iformationPerson){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoInformationPerson.deletinfoemation(iformationPerson);
            }
        });
    };

  public   void updateinfoemation(EntityIformationPerson iformationPerson){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoInformationPerson.updateinfoemation(iformationPerson);
            }
        });
    };
    LiveData< List<EntityIformationPerson>> getallinformation(){
        return daoInformationPerson.getallinformation();
    }
////////////////////////////stage///////////////////////////////

void insertStageData(EntityStageData stageData){
    MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
        @Override
        public void run() {
            daoStageData.insertStageData(stageData);
        }
    });
}

    void deletStageData(EntityStageData stageData){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoStageData.deletStageData(stageData);
            }
        });
    }

    void updateStageData(EntityStageData stageData){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoStageData.updateStageData(stageData);
            }
        });
    }
    LiveData<List<EntityStageData>> getallstagedata(){
        return daoStageData.getallstagedata();

    }

/////////////////////puzzle//////////////////////////

void insertPuzzleData(EntityPuzzleData puzzleData){
    MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
        @Override
        public void run() {
            daoPuzzleData.insertPuzzleData(puzzleData);
        }
    });
}

    void deletPuzzleData(EntityPuzzleData puzzleData){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoPuzzleData.deletPuzzleData(puzzleData);
            }
        });
    }

    void updatePuzzleData(EntityPuzzleData puzzleData){
        MyRoomDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                daoPuzzleData.updatePuzzleData(puzzleData);
            }
        });
    }
}
