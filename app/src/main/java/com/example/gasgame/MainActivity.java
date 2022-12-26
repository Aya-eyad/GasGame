package com.example.gasgame;

import static com.example.gasgame.Service.Notificationservice.CHANNEL_ID;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasgame.Model.Pattren;
import com.example.gasgame.Model.Questions;
import com.example.gasgame.databinding.ActivityMainBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
   public static MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 0,
                intent, 0);
        AlarmManager alarmManager= (AlarmManager) getSystemService(ALARM_SERVICE);
        long time = System.currentTimeMillis();
        long millstosecond = 1000*5;
        alarmManager.set(AlarmManager.RTC_WAKEUP,time+millstosecond,pendingIntent);
       // String jsonstring = Apputility.Parsejson(getApplicationContext(), "json/puzzleGameData.json");
      //  ParsjsonFromAssets(jsonstring);
        mediaPlayer=MediaPlayer.create(getBaseContext(),R.raw.sound);
        mediaPlayer.start();

//notificationchannelnel();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                finish();
            }
        }, 2000);
        binding.tv.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),R.anim.blink_anim
        ));

    }

//    private void notificationchannel() {
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            NotificationChannel channel = new NotificationChannel(CHANNEL_ID
//                    , "channel name", NotificationManager.IMPORTANCE_DEFAULT);
//
//            NotificationManager manager =getSystemService(NotificationManager.class);
//            manager.createNotificationChannel(channel);
//        }
//    }


//    private void ParsjsonFromAssets(String string) {
//        try {
//            JSONObject level1 = new JSONObject(string);
//            int level_no = level1.getInt("level_no");
//            int unlock_points = level1.getInt("unlock_points");
//
//            JSONArray questions1 = level1.getJSONArray("questions");
//            ArrayList<Questions> questionsArrayList = new ArrayList<>();
//            for (int i = 0; i < questions1.length(); i++) {
//                JSONObject questionobject = new JSONObject(questions1.get(i).toString());
//                int id = questionobject.getInt("id");
//                String title = questionobject.getString("title");
//                String answer_1 = questionobject.getString("answer_1");
//                String answer_2 = questionobject.getString("answer_2");
//                String answer_3 = questionobject.getString("answer_3");
//                String answer_4 = questionobject.getString("answer_4");
//                String true_answer = questionobject.getString("true_answer");
//                int points = questionobject.getInt("points");
//                int duration = questionobject.getInt("duration");
//                String hint = questionobject.getString("hint");
//                JSONArray pattern1 = questionobject.getJSONArray("pattern");
//                ArrayList<Pattren> pattrenArrayList = new ArrayList<>();
//                for (int x = 0; x < pattern1.length(); x++) {
//                    JSONObject patternobject = new JSONObject(pattern1.get(i).toString());
//                    int pattern_id = patternobject.getInt("pattern_id");
//                    String pattern_name = patternobject.getString("pattern_name");
//                }
//
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        } catch (JSONException ee) {
//            ee.printStackTrace();
//        }


    }
