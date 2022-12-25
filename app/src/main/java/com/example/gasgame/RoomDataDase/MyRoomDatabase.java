package com.example.gasgame.RoomDataDase;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.gasgame.RoomDataDase.Dao.DaoInformationPerson;
import com.example.gasgame.RoomDataDase.Dao.DaoPuzzleData;
import com.example.gasgame.RoomDataDase.Dao.DaoScroll;
import com.example.gasgame.RoomDataDase.Dao.DaoStageData;
import com.example.gasgame.RoomDataDase.Entity.EntityIformationPerson;
import com.example.gasgame.RoomDataDase.Entity.EntityPuzzleData;
import com.example.gasgame.RoomDataDase.Entity.EntityScroll;
import com.example.gasgame.RoomDataDase.Entity.EntityStageData;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {EntityScroll.class,
        EntityIformationPerson.class, EntityStageData.class
, EntityPuzzleData.class}, version = 1, exportSchema = false)
    public abstract class MyRoomDatabase extends RoomDatabase {

    public abstract DaoInformationPerson daoInformationPerson();

    public abstract DaoScroll daoScroll();
    public abstract DaoStageData daoStageData();
    public abstract DaoPuzzleData daoPuzzleData();

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

