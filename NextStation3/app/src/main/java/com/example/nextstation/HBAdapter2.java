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

public class HBAdapter2 extends ArrayAdapter<More2> {
    List<More2> HBlist2;
    public HBAdapter2 ( @NonNull Context context, int resource, @NonNull List<More2> objects ) {
        super(context, resource, objects);
     HBlist2=objects;



    }

    @NonNull
    @Override
    public View getView ( int position, @Nullable View convertView, @NonNull ViewGroup parent ) {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.omaiwamo2, parent, false);
            More2 currentHB2 = HBlist2.get(position);
            TextView shapeNameTextView2 = view.findViewById(R.id.item2_name);
            Button shapebtn2 = view.findViewById(R.id.itembtn2);
            shapeNameTextView2.setText(currentHB2.getItemName2());
            shapebtn2.setText(currentHB2.getItembutton2());


            return view;
        }
}
