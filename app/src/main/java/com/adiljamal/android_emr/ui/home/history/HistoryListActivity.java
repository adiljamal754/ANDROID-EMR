package com.adiljamal.android_emr.ui.home.history;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.adiljamal.android_emr.R;
import com.adiljamal.android_emr.databinding.ActivityHistoryListBinding;
import com.adiljamal.android_emr.ui.home.history.cronics.CronicsActivity;

public class HistoryListActivity extends AppCompatActivity {

    private ActivityHistoryListBinding binding;
   private String medicalHistoric[] = {"Doenças Crónicas","Histórico de Cirurgias",
   "Estilo de vida", "Histórico de Consultas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHistoryListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_item_list_history, R.id.itemHistoryTV,medicalHistoric);

        binding.historysLV.setAdapter(adapter);

        binding.historysLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                   Intent it = new Intent(HistoryListActivity.this, CronicsActivity.class);
                   startActivity(it);


            }
        });

    }
}