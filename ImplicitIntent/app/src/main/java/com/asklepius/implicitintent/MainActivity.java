package com.asklepius.implicitintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView text;
Button dail,share,whatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.et_text);
        dail=findViewById(R.id.bt_dail);
        share=findViewById(R.id.bt_share);
        whatsapp=findViewById(R.id.bt_whatsapp);
        dail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String number=text.getText().toString();
            Intent i=new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:"+number));
            startActivity(i);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info=text.getText().toString();
                ShareCompat.IntentBuilder.from(MainActivity.this)
                        .setType("text/plain")
                        .setChooserTitle("select any one of this:")
                        .setText(info)
                        .startChooser();
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i=getPackageManager()
                       .getLaunchIntentForPackage("com.whatsapp");
               startActivity(i);
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });


    }
}