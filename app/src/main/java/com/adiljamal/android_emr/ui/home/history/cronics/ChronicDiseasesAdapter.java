package com.adiljamal.android_emr.ui.home.history.cronics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adiljamal.android_emr.R;

import java.util.List;

public class ChronicDiseasesAdapter extends RecyclerView.Adapter<ChronicDiseasesAdapter.ViewHolder> {
    private List<ChronicDiseases> chronicDiseases;
    private Context context;

    public ChronicDiseasesAdapter(Context context, List<ChronicDiseases> chronicDiseases){
        this.chronicDiseases = chronicDiseases;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_chronic_diseases, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChronicDiseasesAdapter.ViewHolder holder, int position) {
        ChronicDiseases chronicDisease = chronicDiseases.get(position);
        holder.diseasesTV.setText(chronicDisease.getDiseases());
        holder.stateTV.setText(chronicDisease.getState());
    }

    @Override
    public int getItemCount() {
        return chronicDiseases.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

            TextView diseasesTV;
            TextView stateTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            diseasesTV = itemView.findViewById(R.id.diseaseTV);
            stateTV = itemView.findViewById(R.id.stateTV);
        }
    }
}
