package com.example.ilauriaartisan_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class Favoris extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoris);


        Toolbar toolbar=findViewById(R.id.topAppBar);
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



    }

    public void sedecconecter(){
        Intent i7=new Intent(Favoris.this, Authentification.class);
        startActivity(i7);



    }






}

