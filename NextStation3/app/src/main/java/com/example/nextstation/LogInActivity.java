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
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import androidx.appcompat.widget.Toolbar;
public class LogInActivity extends AppCompatActivity {
    Toolbar toolbar3;
    ProgressBar progressBar;
    EditText UserEmail;
    EditText UserPass;
    Button UserLogIn;
    FirebaseAuth firebaseAuth;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Toolbar toolbar3 =findViewById(R.id.toolbar2);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        EditText UserEmail = findViewById(R.id.etUserEmail);
        EditText UserPass = findViewById(R.id.etUserPassword);
        Button UserLogIn = (Button) findViewById(R.id.buttonLI);
        Button reset1 =(Button)findViewById(R.id.reset);
        toolbar3.setTitle("Log In");

        firebaseAuth = FirebaseAuth.getInstance();
        UserLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth.signInWithEmailAndPassword(UserEmail.getText().toString(),
                        UserPass.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            Toast.makeText(LogInActivity.this, "test", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), WorkingActivity.class));
                        } else {
                            Toast.makeText(LogInActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();

                        }
                    }

                });


                    }
                });

        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserEmail.setText(null);
                UserEmail.dispatchDisplayHint(View.INVISIBLE);

                UserLogIn.setText(null);
                UserEmail.dispatchDisplayHint(View.INVISIBLE);

            }
        });
    }
}