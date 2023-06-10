package com.example.ilauriaartisan_v1;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    private CircleImageView imageView;
    private TextView titleTextView;
    private RatingBar ratingBar;




    public CustomViewHolder(View itemView) {
        super(itemView);

        // Initialize your views here using findViewById()
        imageView = itemView.findViewById(R.id.item_artisant_img);
        titleTextView = itemView.findViewById(R.id.item_artisant_title);
        ratingBar = itemView.findViewById(R.id.item_artisant_star);



        // Set click listener on the itemView

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    // Handle the item click event
                    // You can use the position variable to identify the clicked item
                    Log.d("RecyclerView", "Item clicked at position: " + position);


                }
            }
        });



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

