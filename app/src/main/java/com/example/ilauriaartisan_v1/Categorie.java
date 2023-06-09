package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Categorie extends AppCompatActivity {

    ListView listView;


    String[] Listartisant =new String[]{"couturier","fleuriste","macon","mecanicien","menuisier","peintre"};
    String[] artisantNum=new String[]{"Artisant 1","Artisant 2","Artisant 3","Artisant 4","Artisant 5 ","Artisant 6" };
    int []Listimage=new int[]{R.drawable.couturier,
            R.drawable.fleuriste,
            R.drawable.macon,
            R.drawable.mecanicien,
            R.drawable.menuisier,
            R.drawable.peintre};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
        listView= (ListView) findViewById(R.id.customListView);

        ArtisantAdapter artisantAdapter=new ArtisantAdapter(getApplicationContext(),Listartisant,Listimage);
        listView.setAdapter(artisantAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("com.example","item is clicked @ position :: "+position);
            }
        });









    }}
