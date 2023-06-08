package com.example.ilauriaartisan_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;



public class Splash extends AppCompatActivity {
    ImageView logo;
    private static final int SPLASH_DURATION = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                logo = (ImageView) findViewById(R.id.logo);
                animationImage();


                // Start the next activity after the splash duration
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish(); // Optional: close the splash screen activity
            }
        }, SPLASH_DURATION);
    }










    public void animationImage(){
        ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(logo, "scaleX", 0.5f);
        ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(logo, "scaleY", 0.5f);
        scaleDownX.setDuration(1000);
        scaleDownY.setDuration(1000);

        AnimatorSet scaleDown = new AnimatorSet();
        scaleDown.play(scaleDownX).with(scaleDownY);

        scaleDown.start();
    }
}