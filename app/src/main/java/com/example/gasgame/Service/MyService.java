package com.example.gasgame.Service;

import static com.example.gasgame.MainActivity.mediaPlayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.IBinder;

import androidx.annotation.Nullable;

import com.example.gasgame.R;

import java.security.Provider;
import java.util.List;
import java.util.Map;

public class MyService extends Service {






    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer= MediaPlayer.create(this, R.raw.sound);
        mediaPlayer.setLooping(true); // Set looping
        mediaPlayer.setVolume(100,100);
        mediaPlayer.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        player.stop();
//    }
//    protected void onNewIntent() {
//        player.pause();
//    }
//
//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }
//
//
















































//     AudioAttributes audioAttributes;
//    Uri NOTIFICATION_SOUND_URI =
//            Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + BuildConfig.APPLICATION_ID + "/" + R.raw.sound);
//    MediaPlayer player;
//    public static final String CHANNEL_ID="channel1";
//    public MyService() {
//    }
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        player= MediaPlayer.create(this, R.raw.sound);
//    }
//
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//                NotificationChannel channel=new NotificationChannel(CHANNEL_ID
//                        ,"channel name", NotificationManager.IMPORTANCE_DEFAULT);
//                 channel.setSound(NOTIFICATION_SOUND_URI, audioAttributes);
//                NotificationManager manager=getSystemService(NotificationManager.class);
//                manager.createNotificationChannel(channel);
//            }
//            Intent intent1=new Intent(getBaseContext(),MyService.class);
//
//            intent1.setAction("stop");
//            PendingIntent pendingIntent=PendingIntent.getService(this, 0,
//                    intent1,0);
//            NotificationCompat.Builder builder=new NotificationCompat.Builder(this,
//                    CHANNEL_ID);
//                    builder.setDefaults(Notification.DEFAULT_SOUND); // This line did the magic for me.
//         audioAttributes = new AudioAttributes.Builder()
//                        .setUsage(AudioAttributes.USAGE_NOTIFICATION)
//                        .build();
//
//          builder  .setAutoCancel(true);
//          builder.setSound(NOTIFICATION_SOUND_URI);
//            builder.setPriority(NotificationCompat.PRIORITY_HIGH);
//            builder.setAutoCancel(true);
//            builder.addAction(R.drawable.ic_launcher_background,"Action",pendingIntent);
////        NotificationManagerCompat managerCompat=NotificationManagerCompat.from(MainActivity.this);
////        managerCompat.notify(1,builder.build());
//            startForeground(1,builder.build());
//            if (intent.getAction()!=null){
//                if (intent.getAction().equals("stop")){
//                    stopSelf();
//                }}
//            player.start();
//            return START_NOT_STICKY;
//        }
//
//
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        player.stop();
//        player.release();
//
//    }
//
//
//    @Override
//    public IBinder onBind(Intent intent) {
//        // TODO: Return the communication channel to the service.
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
}