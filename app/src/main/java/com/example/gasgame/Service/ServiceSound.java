package com.example.gasgame.Service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.example.gasgame.MainActivity;
import com.example.gasgame.R;

public class ServiceSound extends Service {
    public static final String CHANNEL_ID="channel1";
    MediaPlayer mediaPlayer;
    public ServiceSound() {
    }
    @Override//عند انشاء السيبرفس
    public void onCreate() {


        super.onCreate();
        mediaPlayer=MediaPlayer.create(getBaseContext(), R.raw.sound);}
    @Override//عند تشغيل السيرفس
    public int onStartCommand(Intent intent, int flags, int startId) {
      super.onStartCommand(intent, flags, startId);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel=new NotificationChannel(CHANNEL_ID
                    ,"channel name", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        Intent intent1=new Intent(getBaseContext(), MainActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(ServiceSound.this, 0,
                intent1,0);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext(),
                CHANNEL_ID);

        NotificationManagerCompat managerCompat=NotificationManagerCompat.from(getApplicationContext());
        startForeground(1,builder.build());
      mediaPlayer.start();
//         لو طفاها الاندرويد لازم انت تشغلها من تانيreturn START_NOT_STICKY;
//   بترجع تشتغل لحالها وبتلاخد الانتنت معهاreturn START_REDELIVER_INTENT;//  بترجع تشتغل لحالها من غير ما تاخد ال انتنت تاني
        return START_NOT_STICKY;}
    @Override//عند تدمير السيرفس
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();}
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}