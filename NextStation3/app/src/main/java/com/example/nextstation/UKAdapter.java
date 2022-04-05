package com.example.nextstation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class UKAdapter  extends ArrayAdapter<UnitedKingdom> {
    List<UnitedKingdom> ulist;

    public UKAdapter(@NonNull Context context, int resource, @NonNull List<UnitedKingdom> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.uk_list, parent, false);
        UnitedKingdom currentUnitedKingdom = ulist.get(position);

        TextView MUK = view.findViewById(R.id.MedicineUK);
        Button detail1 = view.findViewById(R.id.Detailsbtn1);
       MUK.setText(currentUnitedKingdom.getUKUniversity());
        detail1.setText(currentUnitedKingdom.getUKButton());

        return view;


    }
}



