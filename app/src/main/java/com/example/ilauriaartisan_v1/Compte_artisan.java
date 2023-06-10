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

import androidx.appcompat.widget.Toolbar;
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
    private Button deconnecter,voiravis;




    private ImageView imageView;



    LinearLayout carousel;
    ImageView images;

    private ImageButton cameraBtn;
    int m=0;

    private FloatingActionButton galleryButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compte_artisan);


        carousel = (LinearLayout) findViewById(R.id.carousel_profil_artisent);

        cameraBtn = (ImageButton) findViewById(R.id.my_button);

        deconnecter =  findViewById(R.id.menucedeconnecter);
        voiravis =  findViewById(R.id.menuvoiravis);
        deconnecter.setVisibility(View.GONE);
        voiravis.setVisibility(View.GONE);



        galleryButton = (FloatingActionButton) findViewById(R.id.edit_profile_picture_button);


        Toolbar toolbar = findViewById(R.id.topAppBar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m==0){
                    deconnecter.setVisibility(View.VISIBLE);
                    voiravis.setVisibility(View.VISIBLE);
                    m=1;
                }else{
                    deconnecter.setVisibility(View.GONE);
                    voiravis.setVisibility(View.GONE);
                    m=0;
                }

            }
        });


        setCarousel();

        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermissionAndOpenGallery();

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
                startActivity(Intent.createChooser(intent, "Select Pictures"));
            }

        });

        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermissionAndOpenGallery();

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
                startActivity(Intent.createChooser(intent, "Select Pictures"));
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

                imageView.setImageURI(data.getData());
            }
        }


        if (requestCode == GALLERY_REQ_CODE && resultCode == RESULT_OK) {
            if (data.getClipData() != null) {
                // Multiple images selected
                int count = data.getClipData().getItemCount();
                for (int i = 0; i < count; i++) {
                    Uri imageUri = data.getClipData().getItemAt(i).getUri();
                    // Process each selected image URI as desired
                }
            } else if (data.getData() != null) {
                // Single image selected
                Uri imageUri = data.getData();
                // Process the selected image URI as desired
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
    public void sedeconnecter (View view){
        Intent i=new Intent(Compte_artisan.this,Bienvenue.class);
        startActivity(i);
    }
    // bouton voir avis menu
    /*public void voiravis (View view){
        Intent i=new Intent(Compte_artisan.this,avis.class);
        startActivity(i);
    }*/

}

