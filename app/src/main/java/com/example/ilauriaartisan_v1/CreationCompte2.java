package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreationCompte2 extends AppCompatActivity {
    private Button suivant2 ;
    private EditText  editTextNom,editTextPrenom,editTextVille;
    private TextView champenom,champrenom,champville,champnom2,champprenom2,champville2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_compte2);
        suivant2=(Button) findViewById(R.id.btS2);
        //suivant2.setOnClickListener(on);
        editTextNom=findViewById(R.id.name);
        editTextPrenom=findViewById(R.id.prenom);
        editTextVille=findViewById(R.id.ville);
        champenom=findViewById(R.id.champnom2);
        champrenom=findViewById(R.id.champprenom2);
        champville=findViewById(R.id.champville2);

        champenom.setVisibility(View.GONE);
        champrenom.setVisibility(View.GONE);
        champville.setVisibility(View.GONE);

    }
  /* View.OnClickListener on=new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent iii=new Intent(CreationCompte2.this,CreationCompte3.class);
           startActivity(iii);
       } };*/

    public void suivant2 (View view){
        String n=editTextNom.getText().toString();
        String p=editTextPrenom.getText().toString();
        String v=editTextVille.getText().toString();
        if (n.equals("") && !p.equals("")&& !v.equals("")){
            champenom.setVisibility(View.VISIBLE);
            champrenom.setVisibility(View.GONE);
            champville.setVisibility(View.GONE);

        } else {
            if (!n.equals("") && p.equals("")&& !v.equals("")){
                champenom.setVisibility(View.GONE);
                champrenom.setVisibility(View.VISIBLE);
                champville.setVisibility(View.GONE);
            }else{
                if (!n.equals("") && !p.equals("")&& v.equals("")){
                    champenom.setVisibility(View.GONE);
                    champrenom.setVisibility(View.GONE);
                    champville.setVisibility(View.VISIBLE);
                }else{
                    if (n.equals("") && p.equals("")&& !v.equals("")){
                        champenom.setVisibility(View.VISIBLE);
                        champrenom.setVisibility(View.VISIBLE);
                        champville.setVisibility(View.GONE);
                    }else{
                        if (n.equals("") && !p.equals("")&&  v.equals("")){
                            champenom.setVisibility(View.VISIBLE);
                            champrenom.setVisibility(View.GONE);
                            champville.setVisibility(View.VISIBLE);
                        }else{
                            if (!n.equals("") && p.equals("")&& v.equals("")) {
                                champenom.setVisibility(View.GONE);
                                champrenom.setVisibility(View.VISIBLE);
                                champville.setVisibility(View.VISIBLE);
                            }else{
                                if (n.equals("") && p.equals("")&& v.equals("")){
                                    champenom.setVisibility(View.VISIBLE);
                                    champrenom.setVisibility(View.VISIBLE);
                                    champville.setVisibility(View.VISIBLE);
                                }else{
                                    if (!n.equals("") && !p.equals("")&& !v.equals("")){
                                        Intent ii=new Intent(CreationCompte2.this,CreationCompte3.class);
                                        startActivity(ii);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }


}

