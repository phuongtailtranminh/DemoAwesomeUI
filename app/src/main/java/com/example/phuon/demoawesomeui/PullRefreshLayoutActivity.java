package com.example.phuon.demoawesomeui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.baoyz.widget.PullRefreshLayout;

import java.util.ArrayList;
import java.util.Random;

public class PullRefreshLayoutActivity extends AppCompatActivity {

    private final String TAG = "REFRESH";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pull_refresh_layout);

        final ArrayList listItems = new ArrayList();
        listItems.add("Dog");
        listItems.add("Cat");
        listItems.add("Fish");
        listItems.add("Bird");

        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_view, listItems);
        ListView listView = (ListView) findViewById(R.id.listView2);
        listView.setAdapter(arrayAdapter);

        final PullRefreshLayout layout = (PullRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        layout.setRefreshStyle(PullRefreshLayout.STYLE_MATERIAL);

        final Random random = new Random();
        final String[] listCharacters = {"a", "b", "c", "d", "e", "f", "g", "h"};
        final int size = listCharacters.length;
        // listen refresh event
        layout.setOnRefreshListener(new PullRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                String randomString = listCharacters[random.nextInt(size)];
                listItems.add(randomString);
                arrayAdapter.notifyDataSetChanged();
                Log.d(TAG, "Refreshing");
                layout.setRefreshing(false);

            }
        });


    }
}
