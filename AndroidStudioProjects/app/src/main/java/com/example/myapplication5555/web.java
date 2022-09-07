package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


    }

        public void Taqs (View view) {
            Intent web6 = new Intent(Intent.ACTION_VIEW);
            web6.setData(Uri.parse("https://www.google.com/search?q=phgm+hg%27rs&oq=phgm+hg%27rs&aqs=chrome..69i57.2937j0j7&sourceid=chrome&ie=UTF-8"));
            if (web6.resolveActivity(getPackageManager()) != null) {
                startActivity(web6);

            }
        }


    public void Pry (View view) {
        Intent web7 = new Intent(Intent.ACTION_VIEW);
        web7.setData(Uri.parse("https://www.google.com/search?q=l%2Chrdj+hgwghm&oq=l%2Chrdj+hgwghm+&aqs=chrome..69i57.3745j0j4&sourceid=chrome&ie=UTF-8"));
        if (web7.resolveActivity(getPackageManager()) != null) {
            startActivity(web7);

        }
    }


    public void Talapat (View view) {
        Intent web8 = new Intent(Intent.ACTION_VIEW);
        web8.setData(Uri.parse("https://www.talabat.com/kuwait?adpos=&gclid=Cj0KCQjwguGYBhDRARIsAHgRm4-WuIudXSxHOR0uzjkSqupLvC_Wa-UisArNdoBx3IEsEk7CZcb_VFQaAiWkEALw_wcB"));
        if (web8.resolveActivity(getPackageManager()) != null) {
            startActivity(web8);

        }
    }


    public void Karem (View view) {
        Intent web9 = new Intent(Intent.ACTION_VIEW);
        web9.setData(Uri.parse("https://www.careem.com/ar-ae/careem-ride/"));
        if (web9.resolveActivity(getPackageManager()) != null) {
            startActivity(web9);

        }
    }



}