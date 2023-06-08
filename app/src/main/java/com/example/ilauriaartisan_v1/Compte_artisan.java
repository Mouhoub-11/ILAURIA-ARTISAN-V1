package com.example.ilauriaartisan_v1;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;


import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;


import android.widget.Toast;

import androidx.annotation.Nullable;


import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Compte_artisan extends AppCompatActivity {

    private static final int REQUEST_PERMISSION = 1;
    private static final int REQUEST_IMAGE_GALLERY = 2;
    private static final int GALLERY_REQ_CODE = 1000;

    LinearLayout carousel;
    ImageView images;

    private ImageButton my_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compte_artisan);


        carousel = (LinearLayout) findViewById(R.id.carousel_profil_artisent);


        carousel = (LinearLayout) findViewById(R.id.carousel_profil_artisent);



        setCarousel();

        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermissionAndOpenGallery();

                Intent iGallery = new Intent(Intent.ACTION_PICK);
                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(iGallery, GALLERY_REQ_CODE);

            }

        });
    }

    private void checkPermissionAndOpenGallery() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_PERMISSION);
            } else {
                openGallery();
            }
        } else {
            openGallery();
        }
    }

    private void openGallery() {
        // Access the mobile gallery here
        Toast.makeText(this, "Gallery access granted", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            if (requestCode == GALLERY_REQ_CODE) {

                images.setImageURI(data.getData());
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openGallery();
            } else {
                Toast.makeText(this, "Gallery permission denied", Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void setCarousel() {

        for (int i = 0; i < 10; i++) {
            ImageView images = new ImageView(this);
            images.setAdjustViewBounds(true);
            images.setScaleType(ImageView.ScaleType.FIT_START);
            images.setPadding(0, 0, 8, 0);


            carousel.addView(images);


        }

    }

}

