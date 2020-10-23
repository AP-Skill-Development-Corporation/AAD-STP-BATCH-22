package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

     EditText user_id,user_name;

     static StudentDataBase dataBase;

     List<Student> studentList;

     RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rec);


        user_id=findViewById(R.id.et1);

        user_name=findViewById(R.id.et2);

        dataBase= Room.databaseBuilder(this,StudentDataBase.class,"mydb").allowMainThreadQueries().build();


    }

    public void savedata(View view)
    {

       String uid=user_id.getText().toString();

       String uname= user_name.getText().toString();

       Student student=new Student();

       student.setRollno(uid);

       student.setName(uname);

       dataBase.studentDao().insert(student);

        Toast.makeText(this, "sucessfully inserted", Toast.LENGTH_SHORT).show();



    }

    public void retrivedata(View view)
    {
        studentList=dataBase.studentDao().getdata();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       recyclerView.setAdapter(new MyAdapter(this,studentList));

    }
}