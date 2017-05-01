package com.example.android.hellojammu;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nalin on 01-May-17.
 */

public class JammuDetailsAdapter extends ArrayAdapter<JammuDetails>{

    private static final String LOG_TAG = ArrayAdapter.class.getSimpleName();


    public JammuDetailsAdapter(Activity Context, ArrayList<JammuDetails> jammuDetails) {

        super(Context, 0, jammuDetails);
        // mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }
        JammuDetails jammuDetail = getItem(position);

        TextView placeTextView = (TextView)listItemView.findViewById(R.id.place_view);
        placeTextView.setText(jammuDetail.getPlacesInJammu());

        View textContainer = listItemView.findViewById(R.id.text_container);
        String stringColor = jammuDetail.getPlacesColor();
        int color = ContextCompat.getColor(getContext(),Integer.parseInt(stringColor));
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

