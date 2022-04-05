package com.example.nextstation.ui.Files;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import com.example.nextstation.R;
import com.google.android.gms.common.api.GoogleApi;


public class FilesFragment extends Fragment {


    private FilesViewModel filesViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

       filesViewModel =
             new ViewModelProvider(this).get(FilesViewModel.class);
View root =inflater.inflate(R.layout.files_fragment2,container,false);
       final TextView textview =root.findViewById(R.id.text_Files);
       View view =inflater.inflate(R.layout.files_fragment2,container, false);
       TextView hyperlink = (TextView) view.findViewById(R.id.textView2);
      hyperlink.setMovementMethod(LinkMovementMethod.getInstance());
        TextView hyperlink2 = (TextView) view.findViewById(R.id.textView3);
        hyperlink2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView hyperlink3 = (TextView) view.findViewById(R.id.textView4);
        hyperlink3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView hyperlink4 = (TextView) view.findViewById(R.id.textView5);
        hyperlink4.setMovementMethod(LinkMovementMethod.getInstance());



       filesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
           @Override
           public void onChanged ( String s ) {
               textview.setText(s);
           }
       });

        return view;

    }
}