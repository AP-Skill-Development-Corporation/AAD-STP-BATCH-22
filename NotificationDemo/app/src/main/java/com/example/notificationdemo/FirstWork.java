package com.example.notificationdemo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class FirstWork extends Worker
{

    NotificationManager manager;

    public FirstWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);

        manager= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

    }

    @NonNull
    @Override
    public Result doWork()
    {
        sendnotification();
        return Result.success();
    }

    private void sendnotification()
    {

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {

            NotificationChannel channel=new NotificationChannel("gopal_id",
                    "android_channel",NotificationManager.IMPORTANCE_DEFAULT);

            manager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder=new
                NotificationCompat.Builder(getApplicationContext(),"gopal_id");

        builder.setContentTitle("Python");

        builder.setSmallIcon(R.mipmap.ic_launcher_round);

        builder.setContentText("WELCOME PYTHON WORKSHOP");

        manager.notify(12,builder.build());



    }
}
