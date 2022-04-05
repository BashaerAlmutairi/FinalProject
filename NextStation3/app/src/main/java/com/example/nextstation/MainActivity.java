package com.example.nextstation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ProgressBar progressBar;
    EditText email;
    EditText password;
    Button signup;
    Button logIn1;
    Button ukbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar = findViewById(R.id.progressBar);


        Button signup = findViewById(R.id.sign_up);
         Intent intent1 = new Intent(MainActivity.this, SignUpActivity.class);
                signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        progressBar.setVisibility(View.VISIBLE);
                        startActivity(intent1);

                        ///setup log in button
                    }

                });

                Button logIn1 = (Button) findViewById(R.id.log_in);
            logIn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final Intent intent2 = new Intent(MainActivity.this, LogInActivity.class);
                    startActivity(intent2);

                }
            });

        }
    }