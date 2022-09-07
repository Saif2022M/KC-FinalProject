package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AAA2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaa2);

        Bundle bundle = getIntent().getExtras();
        Hotels deliveredHotels =(Hotels) bundle.getSerializable("Hotels");


        ImageView IMage = findViewById(R.id.imageView2);
        TextView TITEEL = findViewById(R.id.textView2);
        TextView Taqeem = findViewById(R.id.textView5);
        ImageView imageView = findViewById(R.id.imageView3);
        TextView dus = findViewById(R.id.textView44);
        TextView textView = findViewById(R.id.textView4);

        IMage.setImageResource(deliveredHotels.getHotelimage());
        TITEEL.setText(deliveredHotels.getHotelName());
        Taqeem.setText(deliveredHotels.getHoteltqeem());
        imageView.setImageResource(deliveredHotels.getLocationimage());
         dus.setText(deliveredHotels.getHoteldus());
         textView.setText(deliveredHotels.getDATA());


    }

}