package com.adiljamal.android_emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.adiljamal.android_emr.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {

    private ActivityWelcomeBinding welcomeBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        welcomeBinding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(welcomeBinding.getRoot());

        welcomeBinding.getBtn.setOnClickListener( v -> {
            Intent loginIt = new Intent(this, LoginActivity.class);
            startActivity(loginIt);
            this.finish();
        });
    }
}