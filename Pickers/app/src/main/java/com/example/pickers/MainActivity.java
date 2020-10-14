package com.example.pickers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    int c_year,c_month,c_day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar=Calendar.getInstance();

        c_year=calendar.get(Calendar.YEAR);
        c_month=calendar.get(Calendar.MONTH);
        c_day=calendar.get(Calendar.DAY_OF_MONTH);

        findViewById(R.id.alert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("alert");

                builder.setMessage("do you want to close the app");

                builder.setIcon(R.drawable.alert);

                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        finish();
                    }
                });
               builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {

                       dialogInterface.cancel();
                   }
               });

             builder.show();


            }
        });

    }


    public void getdatepicker(View view)
    {

        DatePickerDialog dp=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                Toast.makeText(MainActivity.this,"the data is"+i+"-"+(i1+1)+"-"+i2,Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_day);

        dp.show();

    }
}
