package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class VISA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa);
    }

    public void Visa (View view) {
        Intent web8 = new Intent(Intent.ACTION_VIEW);
        web8.setData(Uri.parse("https://evisa.moi.gov.kw/evisa/home_a.do"));
        if (web8.resolveActivity(getPackageManager()) != null) {
            startActivity(web8);



        }
    }

}