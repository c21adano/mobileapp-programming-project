package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ColorViewHolder>  {
    private ArrayList<Color> colors;

    public RecyclerViewAdapter(ArrayList<Color> colors) {
        this.colors = colors;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview, parent, false);
        return new ColorViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.ColorViewHolder holder, int position) {
        String name = colors.get(position).getName();
        String waveLength = colors.get(position).getWaveLength();
        Integer frequency = colors.get(position).getFrequency();
        holder.name.setText(name);
        holder.waveLength.setText((waveLength));
        holder.frequency.setText(frequency.toString());
        holder.wiki.setText(colors.get(position).getAuxdata().getWiki());

    }

    @Override
    public int getItemCount() {
        return colors.size();
    }

    public class ColorViewHolder extends RecyclerView.ViewHolder {

        private TextView name, waveLength, frequency, wiki;

        public ColorViewHolder(final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.Name);
            waveLength = itemView.findViewById(R.id.waveLength);
            frequency = itemView.findViewById(R.id.Frequency);
            wiki = itemView.findViewById(R.id.wiki);
        }

    }
}
