package com.example.gasgame;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasgame.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnPlay.setOnClickListener(view -> {
            Intent intent=new Intent(getBaseContext(),PlayActivity.class);
            startActivity(intent);
        });
        binding.btnSetting.setOnClickListener(view -> {

            startActivity(new Intent(getBaseContext(),SettingActivity.class));
        });
        binding.btnPlay.setOnClickListener(view -> {

            startActivity(new Intent(getBaseContext(),MainActivity.class));
        });
    }
}