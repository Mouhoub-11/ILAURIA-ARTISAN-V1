package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private Button BtnArtisan ;
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnArtisan = (ExtendedFloatingActionButton) findViewById(R.id.btn2);
        BtnArtisan.setOnClickListener(ok);
    }

        View.OnClickListener ok=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B1=new Intent(MainActivity.this, Authentification.class);
                startActivity(B1);
            } };

    }
