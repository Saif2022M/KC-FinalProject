package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nobza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nobza);
        Button button1 = findViewById(R.id.button1);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button = findViewById(R.id.button);

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nobza.this,histroy.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nobza.this,Nacehaa.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nobza.this,Trath.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nobza.this,lhga.class);
                startActivity(intent);
            }
        });




    }

    public void web_url (View view){
        Intent web = new Intent(Intent.ACTION_VIEW);
        web.setData(Uri.parse("https://www.youtube.com/channel/UCQpHtPg6ND6musQsWfLSEmA"));
       if (web.resolveActivity(getPackageManager())!=null){
           startActivity(web);



       }
    }
}