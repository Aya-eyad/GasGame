package com.example.gasgame.RoomDataDase;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class Reposetry {
    DaoScroll daoScroll;
    DaoInformationPerson daoInformationPerson;
    public Reposetry(Application application){

MyRoomDatabase myRoomDatabase= MyRoomDatabase.getDatabase(application);
daoScroll=myRoomDatabase.daoScroll();
daoInformationPerson=myRoomDatabase.daoInformationPerson();
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
    };




}
