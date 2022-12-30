package com.example.gasgame;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

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
import com.example.gasgame.databinding.ActivityGamestageBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class GameStageActivity extends AppCompatActivity {
ActivityGamestageBinding binding;
    ViewModle viewModle;
    List<LevelEntity>levelEntityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityGamestageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String jsonstring = Apputility.Parsejson(getApplicationContext(), "json/puzzleGameData.json");
        ParsjsonFromAssets(jsonstring);

        viewModle=new ViewModelProvider(this).get(ViewModle.class);
        viewModle.getalllevel().observe(this,levelEntities -> {
            GameStageActivity.this.levelEntityList=levelEntities;
            Log.d("Livedata","onChanged"+levelEntities);
            AdapterGameStage adapter=new AdapterGameStage(levelEntityList, new AdapterGameStage.OnClick() {
                @Override
                public void onclick(int pos) {



                    Intent intent = new Intent(getApplicationContext(), GameplayActivity.class);
                    startActivity(intent);
                }
            });
            binding.rvGamestage.setAdapter(adapter);
            binding.rvGamestage.setLayoutManager(new LinearLayoutManager(GameStageActivity.this
                    , RecyclerView.VERTICAL,false));

        });

    }
    private void ParsjsonFromAssets(String jsonstring) {
        try {
            JSONArray objectarray = new JSONArray();
            for (int q = 0; q < objectarray.length(); q++) {
                JSONObject level1 = objectarray.getJSONObject(q);
                int level_no = level1.getInt("level_no");
                int unlock_points = level1.getInt("unlock_points");
                Log.d("jsonobject", level1.toString());
                viewModle.insertlevel(new LevelEntity(level_no,unlock_points));
                JSONArray questions1 = level1.getJSONArray("questions");
                ArrayList<QustionEntity> questionsArrayList = new ArrayList<>();
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
                    Log.d("qustion", level1.toString());

                    viewModle.insertqustion(new QustionEntity(title
                            ,answer_1,answer_2,answer_3,answer_4,true_answer,points,duration
                            ,hint) );
                    JSONArray pattern1 = questionobject.getJSONArray("pattern");
                    ArrayList<PatternEntity> pattrenArrayList = new ArrayList<>();
                    for (int x = 0; x < pattern1.length(); x++) {
                        JSONObject patternobject = new JSONObject(pattern1.get(i).toString());
                        int pattern_id = patternobject.getInt("pattern_id");
                        String pattern_name = patternobject.getString("pattern_name");
                        Log.d("pattern", pattrenArrayList.toString());
                        viewModle.insertpattern(new PatternEntity(pattern_name));

                    }

                }

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

}