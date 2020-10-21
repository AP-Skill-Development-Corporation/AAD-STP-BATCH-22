package com.example.systembroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

public class MyReceiver extends BroadcastReceiver {

    ImageView img;

    public MyReceiver(ImageView imageView)
    {

        img=imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent)
    {

           switch (intent.getAction())
            {
                case Intent.ACTION_POWER_CONNECTED:
                    img.setImageResource(R.drawable.powerconnect);
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    img.setImageResource(R.drawable.disconnect);
                    break;
                case Intent.ACTION_INPUT_METHOD_CHANGED:
                    img.setImageResource(R.drawable.airplane);
                    break;


            }
    }
}
