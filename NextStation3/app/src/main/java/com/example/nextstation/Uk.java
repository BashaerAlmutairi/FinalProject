package com.example.nextstation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Uk extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);
        ProgressBar progressBar = findViewById(R.id.progressBar3);
        Button detailsbtn1 = (Button) findViewById(R.id.Detailsbtn1);
        Button detailsbtn2 = (Button) findViewById(R.id.Detailsbtn2);
        Button detailsbtn3 = (Button) findViewById(R.id.Detailsbtn3);
        Button detailsbtn4 = (Button) findViewById(R.id.Detailsbtn4);
        Button detailsbtn5 = (Button) findViewById(R.id.Detailsbtn5);

        detailsbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent5 =new Intent(Uk.this,MedicineUK.class);
                startActivity(intent5);

            }
        });
        detailsbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent6 = new Intent(Uk.this, PharmacyUK.class);
                startActivity(intent6);
            }
            });
        detailsbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent6 = new Intent(Uk.this, EngineeringUK.class);
                startActivity(intent6);
            }
        });
        detailsbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent7 = new Intent(Uk.this, DentistryUK.class);
                startActivity(intent7);
            }
        });
        detailsbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent6 = new Intent(Uk.this, politicalscience.class);
                startActivity(intent6);
            }
        });
    }
}