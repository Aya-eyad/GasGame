package com.example.gasgame.Service;

import static java.util.concurrent.TimeUnit.SECONDS;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.gasgame.MainActivity;
import com.example.gasgame.R;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Notificationservice extends BroadcastReceiver {
     public static final String CHANNEL_ID = "channel1";

    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationCompat.Builder   builder = new NotificationCompat.Builder(context,CHANNEL_ID);
        builder.setContentTitle("Hello gise");
        builder.setContentText("Let's play and have fun with the puzzle game");
        builder.setPriority(NotificationCompat.PRIORITY_HIGH);
NotificationManagerCompat managerCompat=NotificationManagerCompat.from(context);
managerCompat.notify(1,builder.build());

//
    }


//    ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
//    private static final int HELLO_ID = 1;
//    public static final String CHANNEL_ID = "channel1";
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            NotificationChannel channel = new NotificationChannel(CHANNEL_ID
//                    , "channel name", NotificationManager.IMPORTANCE_DEFAULT);
//
//            NotificationManager manager = getSystemService(NotificationManager.class);
//            manager.createNotificationChannel(channel);
//        }
//        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
//        PendingIntent pendingIntent = PendingIntent.getService(getApplicationContext(), 0,
//                intent1, 0);
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(),
//                CHANNEL_ID);
//
//
//        long when = System.currentTimeMillis();
//        builder.setContentTitle("Hello gise");
//        builder.setContentText("Let's play and have fun with the puzzle game");
//        builder.setPriority(NotificationCompat.PRIORITY_HIGH);
//
//        builder.addAction(R.drawable.logout, "Action", pendingIntent);
//
//
//        return super.onStartCommand(intent, flags, startId);
//    }
//
//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }

}