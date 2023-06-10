package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AvisArtisanInterface extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private List<MyDataModel> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avis_artisan_interface);



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
    }
}