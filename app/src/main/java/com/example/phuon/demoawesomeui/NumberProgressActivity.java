package com.example.phuon.demoawesomeui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.daimajia.numberprogressbar.NumberProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class NumberProgressActivity extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_progress);

        final NumberProgressBar numberProgressBar = (NumberProgressBar) findViewById(R.id.number_progress_bar);
        final Button btnDownload = (Button) findViewById(R.id.btnDownload);


        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                numberProgressBar.incrementProgressBy(1);
                            }
                        });
                    }
                }, 1000, 100);
            }
        });



    }
}
