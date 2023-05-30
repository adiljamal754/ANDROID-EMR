package com.adiljamal.android_emr.ui.home.vaccine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adiljamal.android_emr.R;

import java.util.ArrayList;
import java.util.List;

public class VaccineAdapter extends RecyclerView.Adapter<VaccineAdapter.ViewHolder> {

    Context context;
    List<Vaccine> vaccines = new ArrayList<>();

    public VaccineAdapter(Context context, List<Vaccine> vaccines) {
        this.context = context;
        this.vaccines = vaccines;
    }

    @NonNull
    @Override
    public VaccineAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_vaccine, parent, false);
        return new VaccineAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VaccineAdapter.ViewHolder holder, int position) {

        Vaccine vaccine = vaccines.get(position);
        holder.nameTV.setText(vaccine.getName());
        holder.dateTV.setText(vaccine.getDate().toString());
    }

    @Override
    public int getItemCount() {
        return vaccines.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameTV;
        TextView dateTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.vaccineNameTV);
            dateTV = itemView.findViewById(R.id.vaccineDateTV);

        }
    }


}
