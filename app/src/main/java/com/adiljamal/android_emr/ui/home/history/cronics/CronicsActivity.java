package com.adiljamal.android_emr.ui.home.history.cronics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.adiljamal.android_emr.databinding.ActivityCronicsBinding;

import java.util.ArrayList;
import java.util.List;

public class CronicsActivity extends AppCompatActivity {

    private ActivityCronicsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCronicsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<ChronicDiseases> chronicDiseasesList = new ArrayList<>();

        chronicDiseasesList.add(new ChronicDiseases("Asma", "Não"));
        chronicDiseasesList.add(new ChronicDiseases("Alzheimer", "Não"));
        chronicDiseasesList.add(new ChronicDiseases("AVC", "Não"));
        chronicDiseasesList.add(new ChronicDiseases("Câncer", "Não"));
        chronicDiseasesList.add(new ChronicDiseases("Doenças Cardio Vasculares", "Não"));
        chronicDiseasesList.add(new ChronicDiseases("Diabetes", "Não"));
        chronicDiseasesList.add(new ChronicDiseases("Depressão", "Não"));
        chronicDiseasesList.add(new ChronicDiseases("Hipertensão", "Não"));

        binding.cronicsRV.setLayoutManager(new LinearLayoutManager(this));

        ChronicDiseasesAdapter adapter = new ChronicDiseasesAdapter(CronicsActivity.this,chronicDiseasesList);
        binding.cronicsRV.setAdapter(adapter);
    }
}