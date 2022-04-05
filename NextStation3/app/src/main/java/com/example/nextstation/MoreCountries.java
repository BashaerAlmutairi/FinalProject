package com.example.nextstation;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MoreCountries extends AppCompatActivity {
 ArrayList<More> HBArray = new ArrayList<More>();
    ArrayList<More2> HBArray2 = new ArrayList<More2>();
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_countries);
         More Jordan = new More ("Jordan", "details");
        More NewZealand = new More ("NewZealand", "details");
        More SaudiArabia= new More ("SaudiArabia", "details");
        HBArray.add(Jordan);
        HBArray.add(NewZealand);
        HBArray.add(SaudiArabia);

        ListView listView = findViewById(R.id.listl);
        HBAdapter hbAdapter = new HBAdapter(this, 0, HBArray);
        listView.setAdapter(hbAdapter);



        More2 Physiotherapy =new More2("Physiotherapy", "details");
        More2 InteriorDesign= new More2 ("Interior Design", "details");
        More2 Marketing = new More2 ("Marketing", "details");

        HBArray2.add(Physiotherapy);
        HBArray2.add(InteriorDesign);
        HBArray2.add(Marketing);

        ListView listView2= findViewById(R.id.listl2);
        HBAdapter2 hbAdapter2 = new HBAdapter2(this, 0, HBArray2);
        listView2.setAdapter(hbAdapter2);
    }
}