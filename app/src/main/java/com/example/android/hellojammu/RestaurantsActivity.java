package com.example.android.hellojammu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details(getResources().getString(R.string.mahadev_restaurant),987634));
        details.add(new Details(getResources().getString(R.string.pahalwan_restaurant) , 857654));
        details.add(new Details(getResources().getString(R.string.spice_restaurant) , 978634));

        DetailsAdapter itemsAdapter = new DetailsAdapter(this,details);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
