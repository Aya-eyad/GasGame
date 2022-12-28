package com.example.gasgame.Adapters;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gasgame.RoomDataDase.Entity.EntityStageData;
import com.example.gasgame.databinding.ItemGamestageBinding;
import com.example.gasgame.databinding.ItemGamestageBinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterGameStage extends RecyclerView.Adapter<AdapterGameStage.Adapterholder> {
    public AdapterGameStage(List<EntityStageData> stageDataList) {
        this.stageDataList = stageDataList;
    }

    List<EntityStageData>stageDataList;


    @NonNull
    @Override
    public Adapterholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       ItemGamestageBinding binding=ItemGamestageBinding.inflate
               (LayoutInflater.from(parent.getContext()),parent,false);

        return new Adapterholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapterholder holder, int position) {
        int pos = position;
        EntityStageData stageDataobject=stageDataList.get(pos);
        holder.stage1.setText(stageDataobject.getNumOfStage());


    }
    @Override
    public int getItemCount() {
        return stageDataList !=null?stageDataList.size():0;
    }




        class Adapterholder extends RecyclerView.ViewHolder {
            TextView stage1 ,  numOfPointRequird;
            ImageView imstage1;

            public Adapterholder(@NonNull ItemGamestageBinding binding) {
                super(binding.getRoot());

                stage1 = binding.tvNum1;
                numOfPointRequird=binding.tvNumPointRequird;
                imstage1 = binding.btnImage1;


            }
        }
    }





