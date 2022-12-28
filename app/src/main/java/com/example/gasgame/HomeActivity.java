package com.example.gasgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.gasgame.RoomDataDase.Entity.EntityScroll;
import com.example.gasgame.RoomDataDase.ViewModle;
import com.example.gasgame.Utility.Apputility;
import com.example.gasgame.databinding.ActivityHomeBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HomeActivity extends AppCompatActivity {
ActivityHomeBinding binding;
ViewModle viewModle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String jsonstring = Apputility.Parsejson(getApplicationContext(), "json/puzzleGameData.json");
        ParsjsonFromAssets(jsonstring);
        viewModle=new ViewModelProvider(this).get(ViewModle.class);
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
    private void ParsjsonFromAssets(String jsonstring) {
        try {
            JSONArray objectarray = new JSONArray();
            for (int q = 0; q < objectarray.length(); q++) {
                JSONObject level1 = objectarray.getJSONObject(q);
                int level_no = level1.getInt("level_no");
                int unlock_points = level1.getInt("unlock_points");
                JSONArray questions1 = level1.getJSONArray("questions");
//                ArrayList<Questions> questionsArrayList = new ArrayList<>();
                for (int i = 0; i < questions1.length(); i++) {
                    JSONObject questionobject = new JSONObject(questions1.get(i).toString());
                    int numofpuzzel = questionobject.getInt("id");
                    String title = questionobject.getString("title");
                    String answer_1 = questionobject.getString("answer_1");
                    String answer_2 = questionobject.getString("answer_2");
                    String answer_3 = questionobject.getString("answer_3");
                    String answer_4 = questionobject.getString("answer_4");
                    String true_answer = questionobject.getString("true_answer");
                    int points = questionobject.getInt("points");
                    int duration = questionobject.getInt("duration");
                    String hint = questionobject.getString("hint");
                    viewModle.insertScroll(new EntityScroll(numofpuzzel,title
                    ,answer_1,answer_2,answer_3,answer_4,true_answer,points,duration,hint));
                    JSONArray pattern1 = questionobject.getJSONArray("pattern");
//                    ArrayList<Pattren> pattrenArrayList = new ArrayList<>();
                    for (int x = 0; x < pattern1.length(); x++) {
                        JSONObject patternobject = new JSONObject(pattern1.get(i).toString());
                        int pattern_id = patternobject.getInt("pattern_id");
                        String pattern_name = patternobject.getString("pattern_name");

                    }

                }

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

}