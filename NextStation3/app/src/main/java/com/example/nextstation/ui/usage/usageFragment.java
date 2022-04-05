package com.example.nextstation.ui.usage;


import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import com.example.nextstation.R;
import com.example.nextstation.ui.Files.FilesViewModel;


public class usageFragment extends Fragment {

    private UsageViewModel UsageViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        UsageViewModel =
                new ViewModelProvider(this).get(UsageViewModel.class);
        View root = inflater.inflate(R.layout.usage_fragment, container, false);
        final TextView textview = root.findViewById(R.id.text_Usage);
        UsageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {


            @Override
            public void onChanged ( String s ) {
                textview.setText(s);
            }
        });

        return root;

    }
    }