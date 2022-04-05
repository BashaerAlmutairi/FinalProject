package com.example.nextstation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class UKActivity extends AppCompatActivity {
    ArrayList<UnitedKingdom> UK_List = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ukactivity);

        ListView UKLV = findViewById(R.id.unitedklist);
        UnitedKingdom MedicineUK = new UnitedKingdom ("Medicine", "Details");
        UnitedKingdom PharmacyUK = new UnitedKingdom ("Pharmacy", "Details");
        UnitedKingdom EngineeringUK = new UnitedKingdom ("Engineering", "Details");
        UnitedKingdom DentistryUK = new UnitedKingdom ("Dentistry", "Details");
        UnitedKingdom NursingUK = new UnitedKingdom ("Nursing", "Details");

        UKAdapter UKAdapter = new UKAdapter(this, 0, UK_List);
        UKLV.setAdapter(UKAdapter);


    }
}