package com.example.gasgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gasgame.Adapters.AdapterGameStage;
import com.example.gasgame.Roomdatabase.Entity.LevelEntity;
import com.example.gasgame.Roomdatabase.Entity.PatternEntity;
import com.example.gasgame.Roomdatabase.Entity.QustionEntity;
import com.example.gasgame.Roomdatabase.ViewModle;
import com.example.gasgame.Utility.Apputility;
import com.example.gasgame.databinding.ActivityHomeBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
ActivityHomeBinding binding;
ViewModle viewModle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);//عشان امحى التولبار الرئيسي واحط الى انا عملتو واخلى الافتراضي تبع البرنامج
        setTitle("Number Game");
        binding.btnPlay.setOnClickListener(view -> {
            Intent intent=new Intent(getBaseContext(), GameStageActivity.class);
            startActivity(intent);
        });

    }

    @Override//انشاء منيو
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);//يركب المنيو الى عملتها  على التولبار

        return true;
    }
    @Override//عمل اكشن على المنيو
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {//يعمل اكشن على العنصر
        switch (item.getItemId()) {
            case R.id.settings:
                Intent intent = new Intent(getBaseContext(), SettingActivity.class);
                startActivity(intent);
                break;


            case R.id.sign_out:
                logOut();


                break;


        }
        return false;
    }
    public void logOut() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Exit Application?");
        alertDialogBuilder
                .setMessage("Are you sure you want to exit the application?")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

}