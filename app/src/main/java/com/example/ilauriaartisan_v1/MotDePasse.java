package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MotDePasse extends AppCompatActivity {
    private TextView chmpObl;
    private EditText erec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mot_de_passe);

        erec = findViewById(R.id.btnrecuperer);
        chmpObl = findViewById(R.id.champrecup);
        chmpObl.setVisibility(View.GONE);
    }

    public void recup(View v){
        String r = erec.getText().toString();
        if(r.equals("")){
            chmpObl.setVisibility(View.VISIBLE);
        }else{
            //l ajout a la bdd
            chmpObl.setVisibility(View.GONE);
        }
    }
}