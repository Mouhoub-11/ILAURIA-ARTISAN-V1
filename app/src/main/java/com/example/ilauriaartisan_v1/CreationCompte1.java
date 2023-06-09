package com.example.ilauriaartisan_v1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreationCompte1 extends AppCompatActivity {
    private Button suivant1 ;
    private EditText editTextEmail1,editTextMdp1,editTextConfirmMdp;

    TextView champemail1 ,champmdp1,champconfirmmdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_compte1);
        suivant1=(Button) findViewById(R.id.btS1);
        editTextEmail1=findViewById(R.id.email1);
        editTextMdp1=findViewById(R.id.password1);
        editTextConfirmMdp=findViewById(R.id.Confirmpassword1);
        champemail1=findViewById(R.id.champemail1);
        champmdp1=findViewById(R.id.champmdp1);
        champconfirmmdp=findViewById(R.id.champconfirmmdp);
        // suivant1.setOnClickListener(on);
        champemail1.setVisibility(View.GONE);
        champmdp1.setVisibility(View.GONE);
        champconfirmmdp.setVisibility(View.GONE);

    }
    /*
    View.OnClickListener on=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent ii=new Intent(CreationCompte1.this,CreationCompte2.class);
            startActivity(ii);
        } };*/
    public void suivant1 (View view){
        String e=editTextEmail1.getText().toString();
        String mdp=editTextMdp1.getText().toString();
        String cmdp=editTextConfirmMdp.getText().toString();
        if (e.equals("") && !mdp.equals("")&& !cmdp.equals("")){
            champemail1.setVisibility(View.VISIBLE);
            champmdp1.setVisibility(View.GONE);
            champconfirmmdp.setVisibility(View.GONE);

        } else {
            if (!e.equals("") && mdp.equals("")&& !cmdp.equals("")){
                champemail1.setVisibility(View.GONE);
                champmdp1.setVisibility(View.VISIBLE);
                champconfirmmdp.setVisibility(View.GONE);
            }else{
                if (!e.equals("") && !mdp.equals("")&& cmdp.equals("")){
                    champemail1.setVisibility(View.GONE);
                    champmdp1.setVisibility(View.GONE);
                    champconfirmmdp.setVisibility(View.VISIBLE);
                }else{
                    if (e.equals("") && mdp.equals("")&& !cmdp.equals("")){
                        champemail1.setVisibility(View.VISIBLE);
                        champmdp1.setVisibility(View.VISIBLE);
                        champconfirmmdp.setVisibility(View.GONE);
                    }else{
                        if (e.equals("") && !mdp.equals("")&& cmdp.equals("")){
                            champemail1.setVisibility(View.VISIBLE);
                            champmdp1.setVisibility(View.GONE);
                            champconfirmmdp.setVisibility(View.VISIBLE);
                        }else{
                            if (!e.equals("") && mdp.equals("")&& cmdp.equals("")) {
                                champemail1.setVisibility(View.GONE);
                                champmdp1.setVisibility(View.VISIBLE);
                                champconfirmmdp.setVisibility(View.VISIBLE);
                            }else{
                                if (e.equals("") && mdp.equals("")&& cmdp.equals("")){
                                    champemail1.setVisibility(View.VISIBLE);
                                    champmdp1.setVisibility(View.VISIBLE);
                                    champconfirmmdp.setVisibility(View.VISIBLE);
                                }else{
                                    if (!e.equals("") && !mdp.equals("")&& !cmdp.equals("")){
                                        Intent ii=new Intent(CreationCompte1.this,CreationCompte2.class);
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





