package com.example.ilauriaartisan_v1;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Authentification extends AppCompatActivity {
    private Button connect ;

    private Button inscrire;
    private Button recupMdp;
    private EditText editTextEmail;

    TextView champemail ,champmdp;

    private EditText editTextMdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentification);
        editTextEmail=findViewById(R.id.email);
        editTextMdp=findViewById(R.id.password);
        champemail=findViewById(R.id.champemail);
        champmdp=findViewById(R.id.champmdp);
        champemail.setVisibility(View.GONE);
        champmdp.setVisibility(View.GONE);



        connect=findViewById(R.id.btnsidentifier);
        connect.setOnClickListener(on);

        inscrire=findViewById(R.id.btnsincrire);
        inscrire.setOnClickListener(sinscrire1);

        recupMdp = findViewById(R.id.button3);
        recupMdp.setOnClickListener(btnRecup);


    }


   View.OnClickListener on =new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent i=new Intent(Authentification.this, Favoris.class);
           startActivity(i);

       } };

    View.OnClickListener sinscrire1 =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i2=new Intent(Authentification.this,CreationCompte1.class);
            startActivity(i2);

        }
    };


    View.OnClickListener btnRecup =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i3=new Intent(Authentification.this,MotDePasse.class);
            startActivity(i3);

        }
    };



    public void Verfier (View view){
        String e=editTextEmail.getText().toString();
        String mdp=editTextMdp.getText().toString();
        if(e.equals("") && !mdp.equals("") ){
            champemail.setVisibility(View.VISIBLE);
            champmdp.setVisibility(View.GONE);
        }else {
            if(mdp.equals("")&& !e.equals("") ){
                champmdp.setVisibility(View.VISIBLE);
                champemail.setVisibility(View.GONE);
            }else {
                if(e.equals("")&& mdp.equals("") ){
                    champmdp.setVisibility(View.VISIBLE);
                    champemail.setVisibility(View.VISIBLE);
                }else{
                    Intent i=new Intent(Authentification.this,CreationCompte1.class);
                    startActivity(i);
                }
            }
        }
    }


}

