package com.adiljamal.android_emr.ui.home.medication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.adiljamal.android_emr.databinding.ActivityMedicationBinding;

public class MedicationActivity extends AppCompatActivity {

    private ActivityMedicationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMedicationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}