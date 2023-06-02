package com.adiljamal.android_emr.ui.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adiljamal.android_emr.OnItemClickListener;
import com.adiljamal.android_emr.R;
import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    Context context;
    List<News> newsList = new ArrayList<>();
    private OnItemClickListener onItemClickListener;


    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }
    public NewsAdapter(Context context, List<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.item_news, parent, false);
        return new NewsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        News news = newsList.get(position);
        holder.imageView.setImageResource(news.getImage());
        holder.titleTV.setText(news.getTitle());
        holder.descTV.setText(news.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onItemClickListener != null) {
                    onItemClickListener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        TextView titleTV;
        TextView descTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.newsImageView);
            titleTV = itemView.findViewById(R.id.newsTitleTV);
            descTV = itemView.findViewById(R.id.newsInfoTV);

        }
    }

}
