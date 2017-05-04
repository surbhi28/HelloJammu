package com.example.android.hellojammu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by nalin on 01-May-17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        final ArrayList<JammuDetails> jammuDetails = new ArrayList<JammuDetails>();

        jammuDetails.add(new JammuDetails(getResources().getString(R.string.category_temples), R.color.color_temples));
        jammuDetails.add(new JammuDetails(getResources().getString(R.string.category_restaurant), R.color.color_restaurants));
        jammuDetails.add(new JammuDetails(getResources().getString(R.string.category_historical_places), R.color.color_historical_places));
        jammuDetails.add(new JammuDetails(getResources().getString(R.string.category_hotels), R.color.color_hotels));

        JammuDetailsAdapter jammuDetailsAdapter = new JammuDetailsAdapter(this,jammuDetails);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(jammuDetailsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                switch (position){
                    case 0:
                        Intent i = new Intent(MainActivity.this,TemplesActivity.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(MainActivity.this,RestaurantsActivity.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(MainActivity.this,HistoricalPlacesActivity.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(MainActivity.this,HotelsActivity.class);
                        startActivity(i3);
                        break;

                }

            }
        });
    }


}
