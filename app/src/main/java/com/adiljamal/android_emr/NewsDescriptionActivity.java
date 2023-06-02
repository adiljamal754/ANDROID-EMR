package com.adiljamal.android_emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.adiljamal.android_emr.databinding.ActivityNewsDescriptionBinding;

public class NewsDescriptionActivity extends AppCompatActivity {

    private ActivityNewsDescriptionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewsDescriptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent extras = getIntent();

        binding.newsTitleTV.setText(extras.getStringExtra("title"));
        binding.newsImageView.setImageResource(extras.getIntExtra("img",0));
        binding.newsInfoTV.setText(extras.getStringExtra("desc"));


    }
}