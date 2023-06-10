package com.example.ilauriaartisan_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class Favoris extends AppCompatActivity {

   private FloatingActionButton galleryButton;


    private static final int REQUEST_PERMISSION = 1;
    private static final int REQUEST_IMAGE_GALLERY = 2;
    private static final int GALLERY_REQ_CODE = 1000;

    private ImageView imageView;

    //

    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private List<MyDataModel> dataList;

///// RECYCLER


////////////





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoris);


        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView);

        // Create a LinearLayoutManager and set it on the RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Create your data list
        dataList = new ArrayList<>();
        // Add data to your list
        dataList.add(new MyDataModel("Title 1", R.drawable.baseline_account_circle_24, 4.5f));
        dataList.add(new MyDataModel("Title 2", R.drawable.baseline_account_circle_24, 3.8f));
        // Add more data as needed

        // Create an instance of your custom adapter and set it on the RecyclerView
        adapter = new CustomAdapter(dataList);
        recyclerView.setAdapter(adapter);









        galleryButton = (FloatingActionButton) findViewById(R.id.edit_profile_picture_button);

        Toolbar toolbar=findViewById(R.id.topAppBar);

        imageView = (ImageView) findViewById(R.id.profile_picture);


        /////////recycler


        ///





        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(Favoris.this, toolbar);
                popupMenu.getMenuInflater().inflate(R.menu.menu_list_item, popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int itemId = item.getItemId();

                        switch (itemId) {

                            case R.id.btnSeDeco:
                                sedecconecter();
                                return true;


                            default:
                                return false;
                        }


                    }
                });


                popupMenu.show();
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

    }

    public void sedecconecter(){
        Intent i7=new Intent(Favoris.this, Authentification.class);
        startActivity(i7);



    }






}

