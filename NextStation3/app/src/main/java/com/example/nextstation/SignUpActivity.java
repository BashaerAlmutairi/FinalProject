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

public class SignUpActivity extends AppCompatActivity {
    Toolbar toolbar;
    ProgressBar progressBar2;
    EditText email;
    EditText password;
    Button sign1;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText email1 = findViewById(R.id.email);
        EditText password1 = findViewById(R.id.password);
        Button sign1 = (Button) findViewById(R.id.SignUp);
//        Button reset1 = (Button)  findViewById(R.id.resetbtn);
        firebaseAuth = FirebaseAuth.getInstance();

        sign1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firebaseAuth.createUserWithEmailAndPassword(email1.getText().toString(),
                        password1.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(SignUpActivity.this, "You've registered successfully",
                                    Toast.LENGTH_LONG).show();

                            Intent intent3 = new Intent(SignUpActivity.this, WorkingActivity.class);

                            startActivity(intent3);

                        } else {
                            Toast.makeText(SignUpActivity.this, task.getException().getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }
}