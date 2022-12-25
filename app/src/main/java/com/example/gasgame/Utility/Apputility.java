package com.example.gasgame.Utility;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
//  لحالوبيسر استدعيها بس activityب  fun عشان انظم الكود بعمل ال
public class Apputility {

    public static String Parsejson(Context context,String Filename) {
        String string="";
        try {//getAssets
            InputStream inputStream=context.getAssets().open(Filename);// داله بتاخد اسم الملف وبتعطينا اياهopen
            //  بدنا نلف عليه وعشان نلف لازم نعرف حجمهInputStream
            // avalablr عشان نعرف حجمه لازم نعمل
            int size=  inputStream.available();//  فيه قيم متوفرةInputStream قديش ال

            byte[] byteobject=new byte[size];  //   لبايتnputStream حولنا ال
            inputStream.read();//قراناه
            inputStream.close();//سكرناه
            //string لازم بعدها بعد محولناه لبايت نحولو ل
            string=new String(byteobject,"UTF-8");// نوعيه الصيغه الى بترجعUTF_8
            // assetsهيك بكون قرات من ال


        } catch (IOException e) {
            e.printStackTrace();
        }return  string;
    }

}
