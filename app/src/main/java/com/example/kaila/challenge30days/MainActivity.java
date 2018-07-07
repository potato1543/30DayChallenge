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

    // call network to control calendar layout/login [save] (networkutils & asyncloader )
    // or see if firebase is easier add [add activity & button to switch to map view]
    // store tasks in database "plank 20 seconds"
    // add a done with challenge button[maybe create login to save data to add a friends list later]
    // notification when complete 5 days, 10, 15, 20, 25, 30

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> ChallengeTimes = new ArrayList<>();
        ChallengeTimes.add("Day 1: Plank 20 seconds");
        ChallengeTimes.add("Day 2: Plank 20 seconds");
        ChallengeTimes.add("Day 3: Plank 30 seconds");
        ChallengeTimes.add("Day 4: Plank 30 seconds");
        ChallengeTimes.add("Day 5: Plank 40 seconds");
        ChallengeTimes.add("Day 6: Rest Day");
        ChallengeTimes.add("Day 7: Plank 45 seconds");
        ChallengeTimes.add("Day 8: Plank 45 seconds");
        ChallengeTimes.add("Day 9: Plank 60 seconds");
        ChallengeTimes.add("Day 10: Plank 60 seconds");
        ChallengeTimes.add("Day 11: Plank 60 seconds");
        ChallengeTimes.add("Day 12: Plank 90 seconds");
        ChallengeTimes.add("Day 13: Rest Day");
        ChallengeTimes.add("Day 14: Plank 90 seconds");
        ChallengeTimes.add("Day 15: Plank 90 seconds");
        ChallengeTimes.add("Day 16: Plank 120 seconds");
        ChallengeTimes.add("Day 17: Plank 120 seconds");
        ChallengeTimes.add("Day 18: Plank 150 seconds");
        ChallengeTimes.add("Day 19: Rest Day");
        ChallengeTimes.add("Day 20: Plank 150 seconds");
        ChallengeTimes.add("Day 21: Plank 150 seconds");
        ChallengeTimes.add("Day 22: Plank 180 seconds");
        ChallengeTimes.add("Day 23: Plank 180 seconds");
        ChallengeTimes.add("Day 24: Plank 210 seconds");
        ChallengeTimes.add("Day 25: Plank 210 seconds");
        ChallengeTimes.add("Day 26: Rest Day");
        ChallengeTimes.add("Day 27: Plank 240 seconds");
        ChallengeTimes.add("Day 28: Plank 240 seconds");
        ChallengeTimes.add("Day 29: Plank 270 seconds");
        ChallengeTimes.add("Day 30: Plank 300 seconds");


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

