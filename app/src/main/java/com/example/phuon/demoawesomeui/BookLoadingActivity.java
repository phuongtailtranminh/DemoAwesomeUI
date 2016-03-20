package com.example.phuon.demoawesomeui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.victor.loading.book.BookLoading;

public class BookLoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_loading);

        final Button btnBookLoading = (Button) findViewById(R.id.btnStartBookLoading);

        final BookLoading bookLoading= (BookLoading) findViewById(R.id.bookloading);
        btnBookLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bookLoading.isStart()) {
                    btnBookLoading.setText("Start");
                    bookLoading.stop();
                }else {
                    btnBookLoading.setText("Stop");
                    bookLoading.start();
                }
            }
        });
    }
}
