package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    int[] images={R.drawable.alavikunta,R.drawable.bhahubhali,
               R.drawable.careof,R.drawable.donga,R.drawable.eega,
               R.drawable.fida,R.drawable.gangleader,
               R.drawable.hyper,R.drawable.ishq,R.drawable.jannu};

    String[] names={"ALLU ARGUN","PRABHAS","CAREOFPALEM","KARTHIK",
    "NANI","VARUN TEJ","NANI","RAM","NITHIN","SHARVANANDH"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rec);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter(this,images,names));



    }
}
