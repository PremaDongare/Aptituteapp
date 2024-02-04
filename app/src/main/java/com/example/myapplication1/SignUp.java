package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp extends AppCompatActivity {

        TextInputEditText editTextEmail, editTextPassword;
        Button button_signup;
        FirebaseAuth mAuth;
        ProgressBar progressBar;
        TextView textView;

        @Override
        public void onStart() {
            super.onStart();
            // Check if user is signed in (non-null) and update UI accordingly.
            FirebaseUser currentUser = mAuth.getCurrentUser();
            if (currentUser != null) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sign_up);


            mAuth = FirebaseAuth.getInstance();
            editTextEmail = findViewById(R.id.email);
            editTextPassword = findViewById(R.id.password);
            button_signup = findViewById(R.id.Btn_signup);
            progressBar = findViewById(R.id.progressBar);
            textView = findViewById(R.id.loginNow);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    startActivity(intent);
                    finish();
                }
            });

            button_signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    progressBar.setVisibility(View.VISIBLE);
                    String email, password, full_name, mobile, confirm_password;
                    email = String.valueOf(editTextEmail.getText().toString());
                    password = String.valueOf(editTextPassword.getText().toString());

                    if(TextUtils.isEmpty(email)){
                        Toast.makeText(SignUp.this, "Please enter your E-mail.", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if(TextUtils.isEmpty(password)){
                        Toast.makeText(SignUp.this, "Please enter your Password.", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    // firebase code

                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {
                                        Toast.makeText(SignUp.this, "User Signed Up successfully.", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                        //open user profile after successful signed Up
                                        startActivity(intent);
                                        finish();

                                    }else {
                                        Toast.makeText(SignUp.this, "User Authentication is failed. Please try again.", Toast.LENGTH_SHORT).show();
                                    }

                                }
                            });
                }
            });
        }


}