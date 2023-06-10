package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class RecuperationMotDePasse extends AppCompatActivity {
    private Button btnRessai;
    private EditText t1,t2,t3,t4;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperation_mot_de_passe);


        btnRessai=findViewById(R.id.btnReessayer);
        btnRessai.setVisibility(View.GONE);


        t1=findViewById(R.id.champs1);
        t2=findViewById(R.id.champs2);
        t3=findViewById(R.id.champs3);
        t4=findViewById(R.id.champs4);


        t1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    t2.requestFocus();
                    return true;
                }
                return false;
            }
        });

        t2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    t3.requestFocus();
                    return true;
                }
                return false;
            }
        });

        t3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    t4.requestFocus();
                    return true;
                }
                return false;
            }
        });

        t4.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    // Perform any desired action
                    return true;
                }
                return false;
            }
        });



    }
    public void ressaiClicked(View view)
    {
        String s1=t1.getText().toString();
        String s2=t2.getText().toString();
        String s3=t3.getText().toString();
        String s4=t4.getText().toString();


        if(s1.equals("")&& s2.equals("") && s3.equals("") && s4.equals("")) {
            btnRessai.setVisibility(View.VISIBLE);
        }
        else{
            //verification base de données
        }
    }


}