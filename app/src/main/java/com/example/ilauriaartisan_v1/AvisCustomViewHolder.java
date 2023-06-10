package com.example.ilauriaartisan_v1;

import android.content.Intent;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AvisCustomViewHolder extends RecyclerView.ViewHolder {
    private CircleImageView imageView;
    private TextView titleTextView;
    private RatingBar ratingBar;

    public AvisCustomViewHolder(View itemView) {
        super(itemView);

        // Initialize your views here using findViewById()
        imageView = itemView.findViewById(R.id.item_artisant_img);
        titleTextView = itemView.findViewById(R.id.item_artisant_title);
        ratingBar = itemView.findViewById(R.id.item_artisant_star);

        // Set click listener on the itemView





    }





    // Getter methods for accessing the views

    public CircleImageView getImageView() {
        return imageView;
    }

    public TextView getTitleTextView() {
        return titleTextView;
    }

    public RatingBar getRatingBar() {
        return ratingBar;
    }





}

