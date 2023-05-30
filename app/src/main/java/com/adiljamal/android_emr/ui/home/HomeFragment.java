package com.adiljamal.android_emr.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.adiljamal.android_emr.HistoryListActivity;
import com.adiljamal.android_emr.databinding.FragmentHomeBinding;
import com.adiljamal.android_emr.ui.home.vaccine.VaccineListActivity;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);


        binding.historyBtn.setOnClickListener( v -> {
            Intent historicIt = new Intent(getContext(), HistoryListActivity.class);
            startActivity(historicIt);
        });

        binding.vaccinationBtn.setOnClickListener( v -> {
            Intent vaccineIt = new Intent(getContext(), VaccineListActivity.class);
            startActivity(vaccineIt);
        });


        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}