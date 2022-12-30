package com.example.gasgame;

//الصوت زابط
// الانتقال للشاشه التسجيل زابط
//*********************باقى النيتفيكيشن والمسح المعلوانات**************************************//////////
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.gasgame.Service.ServiceSound;
import com.example.gasgame.databinding.ActivitySettingBinding;

public class SettingActivity extends AppCompatActivity {
    ActivitySettingBinding binding;
    boolean isplay = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvSignin.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), SigninActivity.class));
        });


        binding.btnClear.setOnClickListener(view -> {

        });

        binding.soundSw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ServiceSound.class);

                if (!isplay) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        ContextCompat.startForegroundService(getApplicationContext(),
                                intent);
                        stopService(intent);

                    } else {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            startForegroundService(intent);
                        }
                    }
                    isplay = true;
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        startForegroundService(intent);
                        isplay = false;
                    }


                }
            }
        });
    }
}