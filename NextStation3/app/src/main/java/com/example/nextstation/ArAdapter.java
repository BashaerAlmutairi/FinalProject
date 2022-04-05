package com.example.nextstation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArAdapter extends RecyclerView.Adapter<ArAdapter.MyViewHolder>{
    private ArrayList<Ar> Ar_list;
     public ArAdapter ( ArrayList<Ar> Ar_list){
         this.Ar_list =Ar_list;


     }
     public class MyViewHolder extends RecyclerView.ViewHolder{
         private Button btn2;
         public MyViewHolder( final View view ){
             super(view);
             btn2=view.findViewById(R.id.qbtn1);

         }


     }
    @NonNull
    @Override
    public ArAdapter.MyViewHolder onCreateViewHolder ( @NonNull ViewGroup parent, int viewType ) {
      View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_ar,parent,false);
      return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder ( @NonNull ArAdapter.MyViewHolder holder, int position ) {
         String name = Ar_list.get(position).getQuestionbtn();
    holder.btn2.setText(name);

    }

    @Override
    public int getItemCount () {
        return Ar_list.size();

    }
}
