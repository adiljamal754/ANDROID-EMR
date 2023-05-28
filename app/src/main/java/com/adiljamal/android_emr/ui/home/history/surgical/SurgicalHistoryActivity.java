package com.adiljamal.android_emr.ui.home.history.surgical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.adiljamal.android_emr.databinding.ActivitySurgicalHistoryBinding;
import com.google.android.material.tabs.TabLayoutMediator;

public class SurgicalHistoryActivity extends AppCompatActivity {

    private ActivitySurgicalHistoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySurgicalHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Crie o adapter para o ViewPager
        FragmentAdapter fragmentAdapter = new FragmentAdapter(this);
        binding.viewPager.setAdapter(fragmentAdapter);

// Vincule o ViewPager ao TabLayout
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Realizadas");
                    break;
                case 1:
                    tab.setText("Marcadas");
                    break;
            }
        }).attach();
    }

}
