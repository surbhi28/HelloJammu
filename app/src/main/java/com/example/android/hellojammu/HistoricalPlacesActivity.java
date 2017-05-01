package com.example.android.hellojammu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details("Bahu Fort",987634));
        details.add(new Details("Hari Niwas Palace" , 857654));
        details.add(new Details("Red Fort" , 978634));

        DetailsAdapter itemsAdapter = new DetailsAdapter(this,details);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
