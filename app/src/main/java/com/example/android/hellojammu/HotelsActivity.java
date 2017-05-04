package com.example.android.hellojammu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        final ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details(getResources().getString(R.string.hotel_one), 987634));
        details.add(new Details(getResources().getString(R.string.hotel_two), 857654));
        details.add(new Details(getResources().getString(R.string.hotel_three), 978634));
        details.add(new Details(getResources().getString(R.string.hotel_four), 978634));
        details.add(new Details(getResources().getString(R.string.hotel_five), 978634));
        details.add(new Details(getResources().getString(R.string.hotel_six), 978634));
        details.add(new Details(getResources().getString(R.string.hotel_seven), 978634));

        DetailsAdapter itemsAdapter = new DetailsAdapter(this,details);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
