package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreationCompte2 extends AppCompatActivity {
    private Button suivant2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_compte2);
        suivant2=(Button) findViewById(R.id.btS2);
        suivant2.setOnClickListener(on);
    }
    View.OnClickListener on=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent iii=new Intent(CreationCompte2.this,CreationCompte3.class);
            startActivity(iii);
        } }; }
