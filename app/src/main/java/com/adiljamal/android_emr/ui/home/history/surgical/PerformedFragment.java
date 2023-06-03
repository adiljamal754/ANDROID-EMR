package com.adiljamal.android_emr.ui.home.history.surgical;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adiljamal.android_emr.R;
import com.adiljamal.android_emr.data.ApiService;
import com.adiljamal.android_emr.databinding.FragmentPerformedBinding;
import com.adiljamal.android_emr.ui.home.history.cronics.ChronicDiseasesAdapter;
import com.adiljamal.android_emr.ui.home.history.cronics.CronicsActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PerformedFragment extends Fragment {

    private FragmentPerformedBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentPerformedBinding.inflate(inflater, container, false);

        List<SurgicalHistory> surgicalHistoryList = new ArrayList<>();

        binding.surgeriesRV.setLayoutManager(new LinearLayoutManager(getContext()));

        SurgeryAdapter adapter = new SurgeryAdapter(getContext());

        ApiService.getInstance().getAllSurgiries(adapter);


        binding.surgeriesRV.setAdapter(adapter);
       return binding.getRoot();

    }
}