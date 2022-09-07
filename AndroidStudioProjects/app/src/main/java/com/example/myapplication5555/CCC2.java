
package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CCC2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccc2);



        Bundle bundle = getIntent().getExtras();
        Plase deleveredPlase =(Plase) bundle.getSerializable("PLS");

        TextView textView = findViewById(R.id.textView99);
        ImageView imageView = findViewById(R.id.imageView99);
        TextView textView1 = findViewById(R.id.textViewll);
        TextView textView2 = findViewById(R.id.textViewkk);



        textView.setText(deleveredPlase.getPlaseName());
        imageView.setImageResource(deleveredPlase.getPlaceImage());
        textView1.setText(deleveredPlase.getPlaseLink());
        textView2.setText(deleveredPlase.getPlasedus());
    }
}