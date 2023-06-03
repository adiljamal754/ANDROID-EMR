package com.adiljamal.android_emr.ui.home.history.surgical;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adiljamal.android_emr.R;
import com.adiljamal.android_emr.ui.home.history.cronics.ChronicDiseasesAdapter;

import java.util.ArrayList;
import java.util.List;

public class SurgeryAdapter extends RecyclerView.Adapter<SurgeryAdapter.ViewHolder> {

    private List<SurgicalHistory> surgicalHistories = new ArrayList<>();
    Context context;

    public SurgeryAdapter(List<SurgicalHistory> surgicalHistories, Context context) {
        this.surgicalHistories = surgicalHistories;
        this.context = context;
    }
    public SurgeryAdapter( Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public SurgeryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_surgery, parent, false);
        return new SurgeryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SurgeryAdapter.ViewHolder holder, int position) {

        SurgicalHistory surgery = surgicalHistories.get(position);
        holder.nameTV.setText(surgery.getName());
        holder.dateTV.setText(surgery.getDate().toString());
    }

    @Override
    public int getItemCount() {
        return surgicalHistories.size();
    }

    public void setSurgeries(List<SurgicalHistory> surgeries) {
        surgicalHistories = surgeries;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameTV;
        TextView dateTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.surgeryNameTV);
            dateTV = itemView.findViewById(R.id.surgeyDateTV);

        }
    }
}
