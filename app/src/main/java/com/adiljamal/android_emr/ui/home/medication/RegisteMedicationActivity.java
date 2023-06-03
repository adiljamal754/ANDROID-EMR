package com.adiljamal.android_emr.ui.home.medication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.adiljamal.android_emr.data.DatabaseHelper;
import com.adiljamal.android_emr.databinding.ActivityMedicationBinding;
import com.adiljamal.android_emr.databinding.ActivityRegisteMedicationBinding;

public class RegisteMedicationActivity extends AppCompatActivity {

    private DatabaseHelper dbHelper;
    private ActivityRegisteMedicationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisteMedicationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dbHelper = new DatabaseHelper(this);

        binding.saveBtn.setOnClickListener( v ->{
            saveMedication();
            this.finish();
        });


        binding.cancelBtn.setOnClickListener( v -> {
            this.finish();
        });


    }

    public void saveMedication(){
       String name = binding.nameET.getText().toString();
       String dosage = binding.dosageET.getText().toString();
       String instructions = binding.descET.getText().toString();

       dbHelper.save(name, dosage,instructions);

        Toast.makeText(this, "Medicação salva", Toast.LENGTH_SHORT).show();
    }
}