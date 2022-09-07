package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void kwati(View view) {
        Intent web1 = new Intent(Intent.ACTION_VIEW);
        web1.setData(Uri.parse("https://www.kuwaitairways.com/ar"));
        if (web1.resolveActivity(getPackageManager()) != null) {
            startActivity(web1);

        }
    }

    public void qatary(View view) {
        Intent web2 = new Intent(Intent.ACTION_VIEW);
        web2.setData(Uri.parse("https://www.qatarairways.com/ar-kw/homepage.html?CID=SXKW23457077M&account=Google-ME_CAUCASUS-KW-AR-Brand&campaign=KW-Brand-Rest-AR_exact&adgroup=qatar+airways&term=%D8%A7%D9%84%D8%AE%D8%B7%D9%88%D8%B7+%D8%A7%D9%84%D8%AC%D9%88%D9%8A%D8%A9+%D8%A7%D9%84%D9%82%D8%B7%D8%B1%D9%8A%D8%A9&gclid=Cj0KCQjwmdGYBhDRARIsABmSEePDdDcfGPvasaQd6shptQaQtn0ikbcf0QC0Xj7lPvc9LDhHrvszFA8aAoGoEALw_wcB&gclsrc=aw.ds"));
        if (web2.resolveActivity(getPackageManager()) != null) {
            startActivity(web2);

        }
    }

    public void jazera(View view) {
        Intent web3 = new Intent(Intent.ACTION_VIEW);
        web3.setData(Uri.parse("https://www.jazeeraairways.com/ar-kw?gclid=Cj0KCQjwmdGYBhDRARIsABmSEePKHYtivGSLekiSC5nA-i24_QLhSwumexNNFtnccE8rEZxqg1w4bh8aAjmCEALw_wcB"));
        if (web3.resolveActivity(getPackageManager()) != null) {
            startActivity(web3);

        }
    }

    public void saudi(View view) {
        Intent web4 = new Intent(Intent.ACTION_VIEW);
        web4.setData(Uri.parse("https://www.saudia.com/?sv_lang=ar"));
        if (web4.resolveActivity(getPackageManager()) != null) {
            startActivity(web4);

        }
    }

    public void egy(View view) {
        Intent web5 = new Intent(Intent.ACTION_VIEW);
        web5.setData(Uri.parse("https://www.egyptair.com/ar/Pages/HomePage.aspx"));
        if (web5.resolveActivity(getPackageManager()) != null) {
            startActivity(web5);

        }
    }

    public void ethad(View view) {
        Intent web6 = new Intent(Intent.ACTION_VIEW);
        web6.setData(Uri.parse("https://www.etihad.com/ar-kw/?CID=PPC-KUWAIT-GOOGLE&gclid=Cj0KCQjwmdGYBhDRARIsABmSEePTn7fZkN4mG0xhFC6kruPXWrP0ZBYj228yGPB7_6u8ldq6kMVntFUaAoBcEALw_wcB&gclsrc=aw.ds"));
        if (web6.resolveActivity(getPackageManager()) != null) {
            startActivity(web6);

        }
    }

    public void emaaer(View view) {
        Intent web7 = new Intent(Intent.ACTION_VIEW);
        web7.setData(Uri.parse("https://www.emirates.com/kw/arabic/"));
        if (web7.resolveActivity(getPackageManager()) != null) {
            startActivity(web7);

        }
    }
        public void oman (View view){
            Intent web8 = new Intent(Intent.ACTION_VIEW);
            web8.setData(Uri.parse("https://www.omanair.com/kw/ar"));
            if (web8.resolveActivity(getPackageManager()) != null) {
                startActivity(web8);

            }
        }


    }
