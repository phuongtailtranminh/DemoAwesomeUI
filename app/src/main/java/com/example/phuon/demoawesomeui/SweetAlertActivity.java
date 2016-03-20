package com.example.phuon.demoawesomeui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class SweetAlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet_alert);

        Button btnBasic = (Button) findViewById(R.id.btnBasic);
        Button btnTextUnder = (Button) findViewById(R.id.btnTextUnder);
        Button btnError = (Button) findViewById(R.id.btnError);
        Button btnSuccess = (Button) findViewById(R.id.btnSuccess);

        btnBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(SweetAlertActivity.this)
                        .setTitleText("Hello world!")
                        .show();
            }
        });

        btnTextUnder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(SweetAlertActivity.this)
                        .setTitleText("This is title")
                        .setContentText("This is content")
                        .show();
            }
        });

        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(SweetAlertActivity.this, SweetAlertDialog.ERROR_TYPE)
                        .setTitleText("Oops...")
                        .setContentText("Something went wrong!")
                        .show();
            }
        });

        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(SweetAlertActivity.this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Good job!")
                        .setContentText("You clicked the button!")
                        .show();
            }
        });
    }
}
