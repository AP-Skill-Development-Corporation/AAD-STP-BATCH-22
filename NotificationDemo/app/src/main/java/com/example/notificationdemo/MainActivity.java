package com.example.notificationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{


    NotificationManager manager;

    OneTimeWorkRequest request1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        request1=new OneTimeWorkRequest.Builder(FirstWork.class).build();


        manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void noti(View view)
    {

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {

            NotificationChannel channel=new NotificationChannel("gopal_id","android_channel",NotificationManager.IMPORTANCE_DEFAULT);

            manager.createNotificationChannel(channel);
        }

        Intent intent=new Intent(this,MainActivity.class);


        PendingIntent pi=PendingIntent.getActivity(this,
                2,intent,PendingIntent.FLAG_UPDATE_CURRENT);


        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"gopal_id");

        builder.setContentTitle("APSSDC");

        builder.setContentText("WELCOME ANDROID APP DEVELOPEMENT");

        builder.setSmallIcon(R.mipmap.ic_launcher_round);

        builder.setDefaults(NotificationCompat.DEFAULT_ALL);

        builder.setAutoCancel(true);

        builder.setPriority(NotificationCompat.PRIORITY_MAX);

        builder.addAction(R.drawable.reply,"Reply",pi);

        builder.setContentIntent(pi);

        manager.notify(2,builder.build());



    }

    public void onetime(View view)
    {

        WorkManager.getInstance(MainActivity.this).enqueue(request1);
    }
}
