package com.adiljamal.android_emr.ui.home.medication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;

import com.adiljamal.android_emr.data.DatabaseHelper;
import com.adiljamal.android_emr.databinding.ActivityMedicationBinding;

import java.util.ArrayList;

public class MedicationActivity extends AppCompatActivity {

    private ArrayList<Medication> medicationList;
    private DatabaseHelper helper;
    private ActivityMedicationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMedicationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
helper = new DatabaseHelper(this);

        medicationList = helper.getAllMedicarions();

        binding.vaccineRV.setLayoutManager(new LinearLayoutManager(this));
        MedicationAdapter adapter = new MedicationAdapter(this, medicationList);
        binding.vaccineRV.setAdapter(adapter);

        helper = new DatabaseHelper(this);

        binding.addBtn.setOnClickListener( v -> {
            Intent it = new Intent(this, RegisteMedicationActivity.class);
            startActivity(it);
        });

    }


}