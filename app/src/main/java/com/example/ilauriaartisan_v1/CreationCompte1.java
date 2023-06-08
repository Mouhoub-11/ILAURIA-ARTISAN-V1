package com.example.ilauriaartisan_v1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreationCompte1 extends AppCompatActivity {
    private Button suivant1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_compte1);
        suivant1=(Button) findViewById(R.id.btS1);
        suivant1.setOnClickListener(on);

    }
    View.OnClickListener on=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent ii=new Intent(CreationCompte1.this,CreationCompte2.class);
            startActivity(ii);
        } }; }



