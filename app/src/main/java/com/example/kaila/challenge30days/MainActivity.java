package com.example.kaila.challenge30days;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyAdapter.ItemClickListener {

    MyAdapter adapter;

    // call network to control calendar layout/login [save] (networkutils & asyncloader ) ? have firebase connected
    // how to keep checkboxes checked once completed a day all how to clear cache
    // store tasks in database "plank 20 seconds"
    // add a done with challenge button
    // notification when complete 5 days, 10, 15, 20, 25, 30

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> ChallengeTimes = new ArrayList<>();
        ChallengeTimes.add("Day 1: ");
        ChallengeTimes.add("Day 2: ");
        ChallengeTimes.add("Day 3: ");
        ChallengeTimes.add("Day 4: ");
        ChallengeTimes.add("Day 5: ");
        ChallengeTimes.add("Day 6: ");
        ChallengeTimes.add("Day 7: ");
        ChallengeTimes.add("Day 8: ");
        ChallengeTimes.add("Day 9: ");
        ChallengeTimes.add("Day 10: ");
        ChallengeTimes.add("Day 11: ");
        ChallengeTimes.add("Day 12: ");
        ChallengeTimes.add("Day 13: ");
        ChallengeTimes.add("Day 14: ");
        ChallengeTimes.add("Day 15: ");
        ChallengeTimes.add("Day 16: ");
        ChallengeTimes.add("Day 17: ");
        ChallengeTimes.add("Day 18: ");
        ChallengeTimes.add("Day 19: ");
        ChallengeTimes.add("Day 20: ");
        ChallengeTimes.add("Day 21: ");
        ChallengeTimes.add("Day 22: ");
        ChallengeTimes.add("Day 23: ");
        ChallengeTimes.add("Day 24: ");
        ChallengeTimes.add("Day 25: ");
        ChallengeTimes.add("Day 26: ");
        ChallengeTimes.add("Day 27: ");
        ChallengeTimes.add("Day 28: ");
        ChallengeTimes.add("Day 29: ");
        ChallengeTimes.add("Day 30: ");


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvTimes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(this, ChallengeTimes);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}

