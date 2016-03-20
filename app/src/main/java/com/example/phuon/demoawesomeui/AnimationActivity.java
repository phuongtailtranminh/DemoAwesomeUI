package com.example.phuon.demoawesomeui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class AnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        Button btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
        Button btnBounceIn = (Button) findViewById(R.id.btnBounceIn);
        Button btnFlash = (Button) findViewById(R.id.btnFlash);
        Button btnHinge = (Button) findViewById(R.id.btnHinge);

        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.FadeIn)
                        .duration(700)
                        .playOn(findViewById(R.id.txtHello));
            }
        });

        btnBounceIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.BounceIn)
                        .duration(700)
                        .playOn(findViewById(R.id.txtHello));
            }
        });

        btnFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Flash)
                        .duration(700)
                        .playOn(findViewById(R.id.txtHello));
            }
        });

        btnHinge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Hinge)
                        .duration(700)
                        .playOn(findViewById(R.id.txtHello));
            }
        });

    }
}
