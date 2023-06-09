package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class Bienvenue extends AppCompatActivity {
    private Button Bienvenue1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenue);
        Bienvenue1=(ExtendedFloatingActionButton) findViewById(R.id.btn2);
        Bienvenue1.setOnClickListener(on);
    }
    View.OnClickListener on=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent B1=new Intent(Bienvenue.this,Authentification.class);
            startActivity(B1);
        } };
}
