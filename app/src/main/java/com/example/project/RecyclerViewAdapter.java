package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.color_list, parent, false);
        return new ColorViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.ColorViewHolder holder, int position) {
        String name = colors.get(position).getName();
        String location = colors.get(position).getLocation();
        Integer size = colors.get(position).getSize();
        Integer cost = colors.get(position).getCost();
        Integer company = colors.get(position).getCompany();
        holder.name.setText(name);
        holder.location.setText((location));
        holder.cost.setText(cost.toString());
        holder.size.setText(size.toString());
        holder.company.setText(company.toString());
        holder.wiki.setText(colors.get(position).getAuxdata().getWiki());


        Picasso.get()
                .load(colors.get(position).getAuxdata().getImg())
                .into(holder.img, new Callback() {
                    @Override
                    public void onSuccess() {}

                    @Override
                    public void onError(Exception e) {
                        Picasso.get().load("https://i.ibb.co/wC7Q8zm/Untitled.png").into(holder.img);
                    }
                });

    }

    @Override
    public int getItemCount() {
        return colors.size();
    }

    public class ColorViewHolder extends RecyclerView.ViewHolder {

        private TextView name, location, size, cost, company, wiki;
        ImageView img;

        public ColorViewHolder(final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.Name);
            location = itemView.findViewById(R.id.location);
            size = itemView.findViewById(R.id.height);
            cost = itemView.findViewById(R.id.cost);
            company = itemView.findViewById(R.id.company);
            wiki = itemView.findViewById(R.id.wiki);
            img = itemView.findViewById(R.id.image_view);
        }

    }
}
