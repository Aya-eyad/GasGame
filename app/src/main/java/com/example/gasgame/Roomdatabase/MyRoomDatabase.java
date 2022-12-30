package com.example.gasgame.Roomdatabase;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.gasgame.Roomdatabase.Dao.DaoInformation;
import com.example.gasgame.Roomdatabase.Dao.Daolevel;
import com.example.gasgame.Roomdatabase.Dao.Daopattern;
import com.example.gasgame.Roomdatabase.Dao.Daoqustion;
import com.example.gasgame.Roomdatabase.Entity.IformationEntiry;
import com.example.gasgame.Roomdatabase.Entity.LevelEntity;
import com.example.gasgame.Roomdatabase.Entity.PatternEntity;
import com.example.gasgame.Roomdatabase.Entity.QustionEntity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {LevelEntity.class,
        QustionEntity.class, PatternEntity.class
, IformationEntiry.class}, version = 1, exportSchema = false)
    public abstract class MyRoomDatabase extends RoomDatabase {

    public abstract DaoInformation daoInformation();

    public abstract Daopattern daopattern();
    public abstract Daolevel daolevel();
    public abstract Daoqustion daoqustion();

    private static volatile MyRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static MyRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (MyRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    MyRoomDatabase.class, "game_database")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }
    private static Callback sRoomDatabaseCallback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);


            databaseWriteExecutor.execute(() -> {

            });
        }
    };
}

