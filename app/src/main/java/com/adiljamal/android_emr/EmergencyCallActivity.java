package com.adiljamal.android_emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.adiljamal.android_emr.databinding.ActivityEmergencyCallBinding;

public class EmergencyCallActivity extends AppCompatActivity {

    private ActivityEmergencyCallBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEmergencyCallBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.AmbulanceBtn.setOnClickListener( v -> {
            String phoneNumber = "tel:+258";
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber));
            startActivity(callIntent);
        });
        binding.hospitalCentralBtn.setOnClickListener( v -> {
            String phoneNumber = "tel:+258";
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber));
            startActivity(callIntent);
        });
        binding.hospitalJoseBtn.setOnClickListener( v -> {
            String phoneNumber = "tel:+258";
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber));
            startActivity(callIntent);
        });
        binding.hospitalPrivadoBtn.setOnClickListener( v -> {
            String phoneNumber = "tel:+258";
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber));
            startActivity(callIntent);
        });
        binding.crossBtn.setOnClickListener( v -> {
            String phoneNumber = "tel:+258";
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber));
            startActivity(callIntent);
        });
        binding.policeBtn.setOnClickListener( v -> {
            String phoneNumber = "tel:+258";
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber));
            startActivity(callIntent);
        });


    }
}