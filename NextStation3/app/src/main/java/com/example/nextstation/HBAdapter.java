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

import java.util.ArrayList;
import java.util.List;

public class HBAdapter extends ArrayAdapter<More> {
    List<More> HBlist;
    public HBAdapter ( @NonNull Context context, int resource, @NonNull ArrayList<More> objects ) {
        super(context, resource, objects);
        HBlist = objects;


    }

    @NonNull
    @Override
    public View getView ( int position, @Nullable View convertView, @NonNull ViewGroup parent ) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.omaiwamo, parent, false);
        More currentHB = HBlist.get(position);
        TextView shapeNameTextView = view.findViewById(R.id.item1_name);
        Button shapebtn = view.findViewById(R.id.itembtn);


        shapeNameTextView.setText(currentHB.getItemName());
        shapebtn.setText(currentHB.getItembutton());


        return view;
    }
}
