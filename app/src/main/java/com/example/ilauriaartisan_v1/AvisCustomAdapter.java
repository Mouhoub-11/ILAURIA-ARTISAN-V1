package com.example.ilauriaartisan_v1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AvisCustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private List<MyDataModel> data; // Replace YourDataModel with your actual data model class

    // Constructor for the adapter
    public AvisCustomAdapter(List<MyDataModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout XML and create a new CustomViewHolder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_artisant, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        // Bind data to the views inside the ViewHolder
        MyDataModel currentItem = data.get(position);

        // Set the values for the views
        holder.getImageView().setImageResource(currentItem.getImageResId());
        holder.getTitleTextView().setText(currentItem.getTitle());
        holder.getRatingBar().setRating(currentItem.getRating());

        // Set click listener on the itemView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the position of the clicked item
                int position = holder.getAdapterPosition();

                // Handle the item click and redirect to another interface
                Intent intent = new Intent(v.getContext(), Compte_artisan.class);
                intent.putExtra("position", position);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        // Return the total number of items in the RecyclerView
        return data.size();
    }
}