package com.example.textviewandscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Alert extends AppCompatActivity {

    int c_year,c_month,c_day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

     Calendar calendar=Calendar.getInstance();

     c_year=calendar.get(Calendar.YEAR);

     c_month=calendar.get(Calendar.MONTH);

     c_day=calendar.get(Calendar.DAY_OF_MONTH);

    }


    public void viewalert(View view)
    {

        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        builder.setTitle("Alert");

        builder.setMessage("do you want close the application");

        builder.setIcon(R.drawable.alert);

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

               finish();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();
            }
        });

        builder.show();
    }


    public void viewdate(View view)
    {

        DatePickerDialog dp=new DatePickerDialog(Alert.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                Toast.makeText(Alert.this,"DATE IS:"+i+"/"+(i1+1)+"/"+i2,Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_day);

        dp.show();

    }
}
