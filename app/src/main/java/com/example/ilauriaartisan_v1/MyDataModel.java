package com.example.ilauriaartisan_v1;

public class MyDataModel {
    private String title;
    private int imageResId;
    private float rating;

    // Constructor
    public MyDataModel(String title, int imageResId, float rating) {
        this.title = title;
        this.imageResId = imageResId;
        this.rating = rating;
    }

    // Getter and setter methods for the attributes (if needed)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}