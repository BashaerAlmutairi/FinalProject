package com.example.nextstation.ui.AutoReply;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.nextstation.MainActivity2;
import com.example.nextstation.R;

public class AutoReplyFragment extends Fragment {

    private AutoReplyViewModel autoreplyviewModel;
    public View onCreateView ( @NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState ) {

        autoreplyviewModel =
                new ViewModelProvider(this).get(com.example.nextstation.ui.AutoReply.AutoReplyViewModel.class);
        View root = inflater.inflate(R.layout.auto_reply_fragment, container, false);
        final TextView textview = root.findViewById(R.id.text_AutoReply);
        View view = inflater.inflate(R.layout.auto_reply_fragment, container, false);

        Button btn1111 = view.findViewById(R.id.call_fragment);

//        btn11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick ( View view) {
//                Intent intent111 = new Intent(getActivity(),MainActivity2.class);
////             intent111.putExtra("some", "some data");
//                startActivity(intent111);
//
//            }
//        });

        btn1111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent1= new Intent (getContext(),MainActivity2.class);
                startActivity(intent1);
            }
        });
        autoreplyviewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged ( String s ) {
                textview.setText(s);

            }
        });

        return view;

    }

}