package com.adiljamal.android_emr;

import androidx.appcompat.app.AppCompatActivity;
import com.adiljamal.android_emr.databinding.ActivityLoginBinding;

import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    //private ActivityLoginBinding loginBinding;
    private ActivityLoginBinding loginBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(loginBinding.getRoot());


        loginBinding.loginBtn.setOnClickListener(v -> {
            Intent navIt = new Intent(this, DrawerActivity.class);
            startActivity(navIt);
        });
    }
}