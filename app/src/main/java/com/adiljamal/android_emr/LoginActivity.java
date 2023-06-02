package com.adiljamal.android_emr;

import androidx.appcompat.app.AppCompatActivity;
import com.adiljamal.android_emr.databinding.ActivityLoginBinding;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //private ActivityLoginBinding loginBinding;
    private ActivityLoginBinding loginBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(loginBinding.getRoot());


        loginBinding.loginBtn.setOnClickListener(v -> {
            if (loginBinding.userET.getText().toString().isEmpty()) {
                loginBinding.userET.setError("Please enter a username");
            }

            if (loginBinding.passET.getText().toString().isEmpty()) {
                loginBinding.passET.setError("Please enter a password");
            }

            if (!loginBinding.userET.getText().toString().isEmpty() &&
                    !loginBinding.passET.getText().toString().isEmpty()) {

                if(loginBinding.userET.getText().toString().equals("adil") &&
                        loginBinding.passET.getText().toString().equals("1234") ){

                    Intent navIt = new Intent(this, DrawerActivity.class);
                    startActivity(navIt);
                    Toast.makeText(this, "Bem Vindo", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "Erro ao efectuar login", Toast.LENGTH_LONG).show();
                    loginBinding.userET.setError("credenciais erradas");
                    loginBinding.passET.setError("credenciais erradas");
                }

            } else {
                loginBinding.userET.setError("Please enter a username");
                loginBinding.passET.setError("Please enter a password");
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.finish();
    }
}