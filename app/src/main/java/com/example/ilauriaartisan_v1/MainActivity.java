package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Bienvenue1 ;
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bienvenue1=(Button) findViewById(R.id.btn2);
        Bienvenue1.setOnClickListener(v -> {

        });
        View.OnClickListener on=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B1=new Intent(MainActivity.this,Authentification.class);
                startActivity(B1);
            } };
    }
}