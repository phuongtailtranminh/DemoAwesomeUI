package com.example.phuon.demoawesomeui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAnimation = (Button) findViewById(R.id.btnAnimation);
        btnAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(intent);
            }
        });

        Button btnSweetAlert = (Button) findViewById(R.id.btnSweetAlert);
        btnSweetAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SweetAlertActivity.class);
                startActivity(intent);
            }
        });

        Button btnShimmerLabel = (Button) findViewById(R.id.btnShimmerLabel);
        btnShimmerLabel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShimmerActivity.class);
                startActivity(intent);
            }
        });

        Button btnSwipeMenu = (Button) findViewById(R.id.btnSwipeMenu);
        btnSwipeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SwipeMenuActivity.class);
                startActivity(intent);
            }
        });


        Button btnSlider = (Button) findViewById(R.id.btnSlider);
        btnSlider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SliderActivity.class);
                startActivity(intent);
            }
        });

        Button btnNumberProgress = (Button) findViewById(R.id.btnNumberProgress);
        btnNumberProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NumberProgressActivity.class);
                startActivity(intent);
            }
        });

        Button btnCalendar = (Button) findViewById(R.id.btnCalendar);
        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(intent);
            }
        });

        Button btnSearchView = (Button) findViewById(R.id.btnSearchView);
        btnSearchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchViewActivity.class);
                startActivity(intent);
            }
        });

        Button btnFAB = (Button) findViewById(R.id.btnFAB);
        btnFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FloatingActionButtonActivity.class);
                startActivity(intent);
            }
        });

        Button btnPullRefreshLayout = (Button) findViewById(R.id.btnPullRefreshLayout);
        btnPullRefreshLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PullRefreshLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button btnFlatButton = (Button) findViewById(R.id.btnFlatButton);
        btnFlatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FlatButtonActivity.class);
                startActivity(intent);
            }
        });

        Button btnViewPager = (Button) findViewById(R.id.btnViewPager);
        btnViewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }
        });


    }
}
