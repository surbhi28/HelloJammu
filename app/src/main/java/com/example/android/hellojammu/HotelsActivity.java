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

        ArrayList<Details> details = new ArrayList<Details>();

        details.add(new Details("KC Residency",987634));
        details.add(new Details("Radisson" , 857654));
        details.add(new Details("17 Miles" , 978634));
        details.add(new Details("Blue Moon" , 978634));
        details.add(new Details("Ramada" , 978634));
        details.add(new Details("Natraj" , 978634));
        details.add(new Details("Sky Lark" , 978634));

        DetailsAdapter itemsAdapter = new DetailsAdapter(this,details);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
