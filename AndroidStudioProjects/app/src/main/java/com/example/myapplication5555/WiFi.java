package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class WiFi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi_fi);
    }
    public void zain (View view) {
        Intent Zain = new Intent(Intent.ACTION_VIEW);
        Zain.setData(Uri.parse("https://www.kw.zain.com/ar/shop"));
        if (Zain.resolveActivity(getPackageManager()) != null) {
            startActivity(Zain);

        }
    }

    public void OOredOO (View view) {
        Intent oo = new Intent(Intent.ACTION_VIEW);
        oo.setData(Uri.parse("https://www.ooredoo.com.kw/portal/en/index"));
        if (oo.resolveActivity(getPackageManager()) != null) {
            startActivity(oo);

        }
    }

    public void STC (View view) {
        Intent stc = new Intent(Intent.ACTION_VIEW);
        stc.setData(Uri.parse("https://www.stc.com.kw/en"));
        if (stc.resolveActivity(getPackageManager()) != null) {
            startActivity(stc);

        }
    }


}