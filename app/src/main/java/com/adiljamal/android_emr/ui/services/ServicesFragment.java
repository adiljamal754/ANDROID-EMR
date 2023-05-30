package com.adiljamal.android_emr.ui.services;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.adiljamal.android_emr.EmergencyCallActivity;
import com.adiljamal.android_emr.HospitalsActivity;
import com.adiljamal.android_emr.databinding.FragmentServicesBinding;

public class ServicesFragment extends Fragment {

    private FragmentServicesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentServicesBinding.inflate(inflater, container, false);

      binding.emergencyBtn.setOnClickListener( v -> {
            Intent emergencyListIt = new Intent(getContext(), EmergencyCallActivity.class);
            startActivity(emergencyListIt);
        });



        binding.hospitalBtn.setOnClickListener( v -> {
            Intent hospitalListIt = new Intent(getContext(), HospitalsActivity.class);
            startActivity(hospitalListIt);
        });



        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}