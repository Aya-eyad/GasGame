package com.example.gasgame;


import static com.example.gasgame.MainActivity.mediaPlayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasgame.Service.MyService;
import com.example.gasgame.databinding.ActivitySettingBinding;

public class SettingActivity extends AppCompatActivity {
ActivitySettingBinding binding;
    MyService myService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//         myService=new MyService();
//        player= MediaPlayer.create(this, R.raw.sound);
        binding.tvProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
            }
        });
        binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
//لهين زبط يكتم الصوت بس ما برجعو يشتغل
        binding.soundSw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!b) {
                    binding.soundSw.setChecked(false);

                    mediaPlayer.stop();
                }else if(b){
                    binding.soundSw.setChecked(true);

                    mediaPlayer.start();
                }
            }
        });

//            // checkbox changes are saved here
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                // set the crime's solved property
//                mCrime.setSolved(isChecked);
//            }
//        });











//        player= MediaPlayer.create(this, R.raw.sound);
//
//binding.soundSw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//    @Override
//    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//
//        // Intent intent=new Intent(getApplicationContext(),MyService.class);
//        if (b) {
//            binding.soundSw.setSoundEffectsEnabled(true);
//            player.start();
//            // startService(intent);
//        }else {
//            binding.soundSw.setSoundEffectsEnabled(false);
//            player.stop();
//            // stopService(intent);
//        }
//    }
//});


//        if (binding.soundSw.isChecked()){
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//                startService(intent);
//            }else {
//                ContextCompat.startForegroundService(getBaseContext(),intent);
//            }
//            binding.soundSw.setChecked(false);
//        }else {
//            stopService(intent);
//            binding.soundSw.setChecked(true);
//
//
//        }
//






}
//    public void onResume() {
//        super.onResume();
//        myService.execute((Void) null);
//    }
//    public void onPause() {
//        super.onPause();
//        myService.cancel(true);
//    }
}