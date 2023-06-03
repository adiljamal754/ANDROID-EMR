package com.adiljamal.android_emr.ui.home.medication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adiljamal.android_emr.R;
import com.adiljamal.android_emr.ui.home.vaccine.VaccineAdapter;

import java.util.ArrayList;

public class MedicationAdapter extends RecyclerView.Adapter<MedicationAdapter.ViewHolder>{

        Context context;
        ArrayList<Medication> medications = new ArrayList<>();

public MedicationAdapter(Context context, ArrayList<Medication> medications) {
        this.context = context;
        this.medications = medications;
        }

@NonNull
@Override
public MedicationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
        R.layout.item_medication, parent, false);
        return new MedicationAdapter.ViewHolder(view);
        }


    @Override
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Medication medication = medications.get(position);
        holder.nameTV.setText(medication.getName());
        holder.dosageTV.setText(medication.getDosage());
        }



    @Override
public int getItemCount() {
        return medications.size();
        }
public class ViewHolder extends RecyclerView.ViewHolder{

    TextView nameTV;
    TextView dosageTV;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        nameTV = itemView.findViewById(R.id.medicationNameTV);
        dosageTV = itemView.findViewById(R.id.dosageTV);

    }
}

}
