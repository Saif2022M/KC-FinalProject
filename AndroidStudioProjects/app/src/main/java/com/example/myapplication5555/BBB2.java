package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BBB2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbb2);


        Bundle bundle = getIntent().getExtras();
        Restrounts deleveredRes =(Restrounts) bundle.getSerializable("RES");

        TextView textView = findViewById(R.id.textView2);
        ImageView imageView = findViewById(R.id.imageView2);
        TextView textView1 = findViewById(R.id.textView4);
        TextView textView2 = findViewById(R.id.textView44);



        textView.setText(deleveredRes.getRestrontName());
        imageView.setImageResource(deleveredRes.getRestrantImage());
        textView1.setText(deleveredRes.getData1());
        textView2.setText(deleveredRes.getRestrantdus());
    }
}