package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void first1(View view)
    {

        Intent f=new Intent(getApplicationContext(),First.class);
        startActivity(f);
    }

    public void second(View view)
    {

        Intent f=new Intent(getApplicationContext(),Second.class);
        startActivity(f);
    }

    public void fourth(View view)
    {

        Intent f=new Intent(getApplicationContext(),Third.class);
        startActivity(f);
    }


}
