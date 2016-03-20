package com.example.phuon.demoawesomeui;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnItemClickListener;

import dmax.dialog.SpotsDialog;

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

        Button btnDialogPlus = (Button) findViewById(R.id.btnDialogPlus);

        btnDialogPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, true);
                DialogPlus dialog = DialogPlus.newDialog(MainActivity.this)
                        .setAdapter(adapter)
                        .setOnItemClickListener(new OnItemClickListener() {
                            @Override
                            public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                            }
                        })
                        .setExpanded(true)  // This will enable the expand feature, (similar to android L share dialog)
                        .create();
                dialog.show();
            }
        });


        Button btnBarchart = (Button) findViewById(R.id.btnBarchart);
        btnBarchart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BarChartActivity.class);
                startActivity(intent);
            }
        });

        Button btnStackedBarchart = (Button) findViewById(R.id.btnStackedBarchart);
        btnStackedBarchart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StackedBarchartActivity.class);
                startActivity(intent);
            }
        });

        Button btnPiechart = (Button) findViewById(R.id.btnPiechart);
        btnPiechart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PieChartActivity.class);
                startActivity(intent);
            }
        });

        Button btnLinechart = (Button) findViewById(R.id.btnLinechart);
        btnLinechart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LineChartActivity.class);
                startActivity(intent);
            }
        });

        Button btnCircleImageView = (Button) findViewById(R.id.btnCircleImageView);
        btnCircleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CircleImageViewActivity.class);
                startActivity(intent);
            }
        });

        Button btnKenburnView = (Button) findViewById(R.id.btnKenburnView);
        btnKenburnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KenBurnsViewActivity.class);
                startActivity(intent);
            }
        });

        Button btnBookLoading = (Button) findViewById(R.id.btnBookLoading);
        btnBookLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BookLoadingActivity.class);
                startActivity(intent);
            }
        });

        Button btnSpotDialog = (Button) findViewById(R.id.btnSpotDialog);
        btnSpotDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new SpotsDialog(MainActivity.this, "Loading");
                dialog.show();
            }
        });

    }
}
