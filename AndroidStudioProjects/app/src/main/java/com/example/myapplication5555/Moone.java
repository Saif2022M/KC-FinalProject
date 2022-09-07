package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Moone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moone);

        double Dolar = 0.3093 ;

        EditText First  = findViewById(R.id.EditText1);
        Button button = findViewById(R.id.Ehceb1);
        TextView textView1 = findViewById(R.id.Nateg1);
        EditText second = findViewById(R.id.EditText2);
        Button button1 = findViewById(R.id.Ehceb2);
        TextView textView = findViewById(R.id.Nateg2);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int num1 = Integer.parseInt(First.getText().toString());
                double num2 = Dolar;
                double result = num1 * num2;

                textView1.setText(String.valueOf(result));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(second.getText().toString());
                double num2 = Dolar;
                double result = num1 / num2;

                textView.setText(String.valueOf(result));

            }
        });
    }
}

