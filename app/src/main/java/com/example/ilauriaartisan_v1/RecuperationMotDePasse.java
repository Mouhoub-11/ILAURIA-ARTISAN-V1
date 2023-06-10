package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RecuperationMotDePasse extends AppCompatActivity {
    private Button b;
    private EditText t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btnc);
        t1=findViewById(R.id.e1);
        t2=findViewById(R.id.e2);
        t3=findViewById(R.id.e3);
        t4=findViewById(R.id.e4);
        t5=findViewById(R.id.e5);
        t6=findViewById(R.id.e6);
        b.setVisibility(View.GONE);
    }
    public void v(View view)
    {
        String s1=t1.getText().toString();
        String s2=t2.getText().toString();
        String s3=t3.getText().toString();
        String s4=t4.getText().toString();
        String s5=t5.getText().toString();
        String s6=t6.getText().toString();

        if(s1.equals("")&& s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals("")) {
            b.setVisibility(View.VISIBLE);
        }
        else{
            //verification base de données
        }
    }


}