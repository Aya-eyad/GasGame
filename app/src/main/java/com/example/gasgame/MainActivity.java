package com.example.gasgame;
//*المسؤول عن ربط التطبيق بالفيرباز هو ملف الجيسون تبع جوجل*/

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasgame.Service.ServiceSound;
import com.example.gasgame.Utility.Apputility;
import com.example.gasgame.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    boolean isplaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(getApplicationContext(), ServiceSound.class);
        if(!isplaying){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startService(intent);
        }}


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                finish();
            }
        }, 2000);
        binding.tv.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.blink_anim
        ));

    }



}