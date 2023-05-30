package com.adiljamal.android_emr.ui.home.vaccine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.adiljamal.android_emr.databinding.ActivityVaccineListBinding;
import com.adiljamal.android_emr.ui.home.history.surgical.SurgeryAdapter;
import com.adiljamal.android_emr.ui.home.history.surgical.SurgicalHistory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class VaccineListActivity extends AppCompatActivity {

    private ActivityVaccineListBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVaccineListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        List<Vaccine> vaccines = new ArrayList<>();

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            vaccines.add(new Vaccine("Johson Johnson", formato.parse("20-03-2020"), "Cirurgia realizada no pé direito. No hospital central de mapito devido a um objeto que entrou no dedo pelo dr. João"));
            formato = new SimpleDateFormat("dd-MM-yyyy");
            vaccines.add(new Vaccine("Cirurgia no dedo", formato.parse("02-06-2020"), "Cirurgia realizada no dedo da mão esquerda. No hospital central de mapito devido a um objeto que entrou no dedo pelo dr. João"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        binding.vaccineRV.setLayoutManager(new LinearLayoutManager(this));

        VaccineAdapter adapter = new VaccineAdapter(this, vaccines);
        binding.vaccineRV.setAdapter(adapter);

        Log.i("TAG",""+ adapter.getItemCount());
    }
}