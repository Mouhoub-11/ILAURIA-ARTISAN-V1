package com.example.ilauriaartisan_v1;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Authentification extends AppCompatActivity {
    private Button inscrire ;

    private Button sidentifier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
        inscrire=(Button) findViewById(R.id.btnsidentifier);
        inscrire.setOnClickListener(on);

        sidentifier=(Button) findViewById(R.id.btnsincrire);
        sidentifier.setOnClickListener(ident);

    }
    View.OnClickListener on=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(Authentification.this,CreationCompte1.class);
            startActivity(i);

        } };

    View.OnClickListener ident=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i2=new Intent(Authentification.this,Compte_artisan.class);
            startActivity(i2);

        } };


}