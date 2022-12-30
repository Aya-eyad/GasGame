package com.example.gasgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
//                                                        Log.d("LoginActivity",task.getException().getMessage());
//                                          Log.d("LoginActivity",task.getResult().getUser().toString());
//                                       Log.d("LoginActivity",task.getResult().getUser().toString());
//                            Log.d("LoginActivity",task.getException().getMessage());
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


import com.example.gasgame.databinding.ActivitySigninBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

//ميزة ازا عمل تسجيل دخول ممكن ما بفتح الليفل التاني الا ازا سجل الدخول
public class SigninActivity extends AppCompatActivity {
ActivitySigninBinding binding;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.tvCreatacount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

        binding.btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }





    private void register() {
        String email = binding.edEmailSignin.getText().toString();
        String password = binding.edPassSignin.getText().toString();
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            startActivity(new Intent(getApplicationContext(),ProfileActivity.class));

                        }else{
                            Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }

                });
    }
    private void login() {
        String email = binding.edEmailSignin.getText().toString();
        String password = binding.edPassSignin.getText().toString();
        mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                        }else{
                            Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }

                });
    }
}


