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

import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FinaliserCompte extends AppCompatActivity {

    private static final int REQUEST_PERMISSION = 1;
    private static final int REQUEST_IMAGE_GALLERY = 2;
    private static final int GALLERY_REQ_CODE = 1000;
    private FloatingActionButton galleryButton;
    private ImageView imageView;

    private ExtendedFloatingActionButton cameraBtn;

    private Button plusTard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finaliser_compte);


        imageView = (ImageView) findViewById(R.id.profile_picture);

        galleryButton = (FloatingActionButton) findViewById(R.id.edit_profile_picture_button);

        plusTard = (Button) findViewById(R.id.plustardBtn);

        cameraBtn = (ExtendedFloatingActionButton) findViewById(R.id.extended_fab);

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
        plusTard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2=new Intent(FinaliserCompte.this, Compte_artisan.class);
                startActivity(B2);
            }
        });

        galleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermissionAndOpenGallery();

                Intent iGallery = new Intent(Intent.ACTION_PICK);
                iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(iGallery, GALLERY_REQ_CODE );

            }
        });

        plusTard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent B2=new Intent(FinaliserCompte.this, Compte_artisan.class);
                startActivity(B2);
            }
        });


    }


    private void checkPermissionAndOpenGallery() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
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




}
