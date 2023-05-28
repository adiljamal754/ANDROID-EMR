package com.adiljamal.android_emr.ui.home.history.surgical;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adiljamal.android_emr.R;
import com.adiljamal.android_emr.databinding.FragmentMarkedBinding;

public class MarkedFragment extends Fragment {

    private FragmentMarkedBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMarkedBinding.inflate(inflater, container, false);




        return binding.getRoot();
    }
}