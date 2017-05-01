package com.example.android.hellojammu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TemplesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        ArrayList<Details>details = new ArrayList<Details>();

        details.add(new Details(getResources().getString(R.string.ragunath_temple),987634,R.drawable.ragunath));
        details.add(new Details(getResources().getString(R.string.mohmaya_temple) ,857654,R.drawable.mohmaya));
        details.add(new Details(getResources().getString(R.string.shiv_temple), 978634,R.drawable.panch));

        DetailsAdapter itemsAdapter = new DetailsAdapter(this,details);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
