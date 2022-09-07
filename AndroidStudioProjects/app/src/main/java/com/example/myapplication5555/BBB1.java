package com.example.myapplication5555;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BBB1 extends AppCompatActivity {
    ArrayList<Restrounts> RestrantList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbb1);

        Restrounts Freg = new Restrounts("مطعم فريج صويلح",R.drawable.freg,"https://goo.gl/maps/8d8FZyv8PzJLs67d7","المطعم من اشهر المطاعم في الكويت يتميز بالأكل الكويتي اللذيذ . المكان من دورين يوجد جلسات نظام غرف وجلسات مفتوحة الخدمة. جيدة. التعامل راقي الاكل. والطعم. والمذاق ممتاز الاسعار جيدة . الازدحام في وقت الذروة . الديكورات جميلة. خدمة القهوة والشاهي واللقيمات مجانا .");
        Restrounts Sapeniat = new Restrounts("مطعم السبعينات",R.drawable.sabenat,"https://goo.gl/maps/gwSawHNrz991F5Gi9","مطعم السبعينات في الكويت هو مطعم يتميز بالأكلات الكويتية الأصيلة ، ويقدم قائمة كبيرة منها مثل مجبوس لحم ومجبوس دجاج ومطبق زبيدي ومموش ربيان والعديد من الأصناف الأخرى ذلك بالإضافة إلى ضيافتهم الرحبة وديكورهم الجميل المرتبط بالتراث الكويتي ، وللمطعم عدة فروع في مختلف مناطق الكويت .");
        Restrounts Mac = new Restrounts("McDonald's",R.drawable.mack,"https://goo.gl/maps/qx7GwnGGoMXh5CPi8","\u200F هي شركة اغذية ووجبات سريعة أمريكية انتشرت في كافة انحاء العالم، تأسست 15 مايو 1940، إحدى أكبر سلسلة مطاعم الوجبات السريعة في العالم.\n" +
                "\n" +
                "الطعام الأساسي الذي يعده هو البرجر بأنواعه وأحجامه المختلفة، بطاطا مقلية، بعض وجبات الإفطار، مشروبات غازية، حليب وحلويات، المثلجات. وحديثًا يقدم المأكولات الصحية كالسلطات");
        Restrounts karoof = new Restrounts("مطعم الخروف",R.drawable.karof,"https://goo.gl/maps/XndN6kZ3iWTP56iN9","مطعم الخروف من المطاعم المميزه بالطبخ الكويتي\n" +
                "واشتهر بطبخه البريه لحم واللحم عندهم محلي\n" +
                "والمرقوق عنده مميزه افضل مرقوق اكلتها بمطعم\n" +
                "يوجد قسم للعائلات");
        Restrounts starPox = new Restrounts("Starbucks",R.drawable.kfcc, "https://goo.gl/maps/aN6QKqB5vYnkQddH9","تقدم الآن شركة ستاربكس العديد من المشروبات الساخنة والباردة منها الموكا، اسبريسو، قهوة أمريكية، الشوكولاته، الفانيلا والكريمه، الكراميل وغيرهم. ولا ننسى أيضا الحلويات والسندويشات التي تقدمها ستاربكس في جميع أفرعها في جميع أنحاء العالم جسمك ضعييف لو متعرفش starbucks");

        Restrounts ftayer = new Restrounts("فطاير على الطاير",R.drawable.ftayer,"https://goo.gl/maps/nZTz1ar21bUxKpZ28","فطاير على الطاير اللذيذه تذوقو أشهى أنواع الفطاير المميزة");
        Restrounts KFC = new Restrounts("KFC",R.drawable.download,"https://goo.gl/maps/Snjbmah2KHDGKsXJ7","دجاج كنتاكي أو كي إف سي كما تُعرف حالياً \u200F - هي سلسلة مطاعم للوجبات السريعة تختص أساساً بالدجاج المقلي. يقع مقرها في مدينة لويفيل بولاية كنتاكي");
        Restrounts OSTAZ = new Restrounts("أستاذ شاورما",R.drawable.shawerma,"https://goo.gl/maps/m9nxSKj1zuutcpCZ6","أستاذ شاورما هو مطعم في الكويت يقدم أكلات من المطبخ شاورما ");


        RestrantList.add(Freg);
        RestrantList.add(Sapeniat);
        RestrantList.add(Mac);
        RestrantList.add(karoof);
        RestrantList.add(starPox);
        RestrantList.add(ftayer);
        RestrantList.add(KFC);
        RestrantList.add(OSTAZ);


        ListView listView1 = findViewById(R.id.list2);

        RestrontADaPTAR Adabtar1 = new RestrontADaPTAR(this,0,RestrantList);

        listView1.setAdapter(Adabtar1);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Restrounts currenRestront = RestrantList.get(i);
                Intent intent = new Intent(BBB1.this,BBB2.class);
                intent.putExtra("RES",currenRestront);
                startActivity(intent);
            }
        });


    }
}