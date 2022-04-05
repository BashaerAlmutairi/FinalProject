package com.example.nextstation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class USAActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usaactivity);
        ProgressBar progressBar = findViewById(R.id.progressBar3);
        Button detailsbtn1usa = (Button) findViewById(R.id.Detailsbtn1USA);
        Button detailsbtn2usa = (Button) findViewById(R.id.Detailsbtn2USA);
        Button detailsbtn3usa = (Button) findViewById(R.id.Detailsbtn3USA);
        Button detailsbtn4usa = (Button) findViewById(R.id.Detailsbtn4USA);
        Button detailsbtn5usa = (Button) findViewById(R.id.Detailsbtn5USA);

        detailsbtn1usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent5 =new Intent(USAActivity.this,USAMedicine.class);
                startActivity(intent5);

            }
        });
        detailsbtn2usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent6 = new Intent(USAActivity.this, USAEngineering.class);
                startActivity(intent6);
            }
        });
        detailsbtn3usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent6 = new Intent(USAActivity.this, graphicdesignerusa.class);
                startActivity(intent6);
            }
        });
        detailsbtn4usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent7 = new Intent(USAActivity.this, USAGraphic.class);
                startActivity(intent7);
            }
        });
        detailsbtn5usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                progressBar.setVisibility(View.VISIBLE);
                Intent intent6 = new Intent(USAActivity.this, usapolitics.class);
                startActivity(intent6);
            }
        });

    }
}