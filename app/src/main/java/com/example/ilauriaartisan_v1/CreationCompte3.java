package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CreationCompte3 extends AppCompatActivity  {
    private Button suivant3 ;
    private Spinner spinner;
    private EditText editTextdesc;
    private TextView champdesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_compte3);
        suivant3=(Button) findViewById(R.id.btS3);
        editTextdesc=findViewById(R.id.creation_compte_dsc);
        champdesc=findViewById(R.id.champdesc5);
        champdesc.setVisibility(View.GONE);


        spinner=findViewById(R.id.spinner);
        String[] option={"mecanicien","plambier","macon"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,option);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //suivant3.setOnClickListener(on);
    }
    /* View.OnClickListener on=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent iiii=new Intent(CreationCompte3.this,FinaliserCompte.class);
            startActivity(iiii);
        } };*/

    public void suivant3 (View view){
        String d=editTextdesc.getText().toString();
        if (d.equals("")){
            champdesc.setVisibility(View.VISIBLE);
        }else{
            champdesc.setVisibility(View.GONE);
            Intent iiii=new Intent(CreationCompte3.this,FinaliserCompte.class);
            startActivity(iiii);
        }


    }

}





