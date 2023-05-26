package com.adiljamal.android_emr;

import androidx.appcompat.app.AppCompatActivity;
import com.adiljamal.android_emr.databinding.ActivityLoginBinding;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding loginBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(loginBinding.getRoot());
    }
}