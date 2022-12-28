package com.example.gasgame;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gasgame.Adapters.AdapterGameStage;
import com.example.gasgame.RoomDataDase.Entity.EntityStageData;
import com.example.gasgame.RoomDataDase.ViewModle;
import com.example.gasgame.Utility.Apputility;
import com.example.gasgame.databinding.ActivityGamestageBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class GameStageActivity extends AppCompatActivity {
ActivityGamestageBinding binding;
    ViewModle viewModle;
    List<EntityStageData> stageDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityGamestageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModle=new ViewModelProvider(this).get(ViewModle.class);
            AdapterGameStage adapterGameStage=new AdapterGameStage(stageDataList);
        binding.rvGamestage.setAdapter(adapterGameStage);
        binding.rvGamestage.setLayoutManager(new LinearLayoutManager(getApplicationContext()
                , RecyclerView.VERTICAL,false));

    }
}