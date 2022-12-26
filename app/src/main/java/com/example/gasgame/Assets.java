package com.example.gasgame;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Assets {
        public static String readFromAssets(Context context, String fileJsonName) {
            String string = "";
            try {
                InputStream inputStream=context.getAssets().open("PuzzleGameData.json");
                int size =inputStream.available();
                byte [] byteObject=new byte[size];
                inputStream.read(byteObject);
                inputStream.close();
                string=new String(byteObject,"UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return string;
        }
        public static void parsJson(){

        }

    }
