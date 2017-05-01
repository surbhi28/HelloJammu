package com.example.android.hellojammu;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nalin on 21-Apr-17.
 */

public class DetailsAdapter extends ArrayAdapter<Details> {

    private static final String LOG_TAG = ArrayAdapter.class.getSimpleName();


    public DetailsAdapter(Activity Context, ArrayList<Details> details) {

        super(Context, 0, details);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Details currentDetail = getItem(position);

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.name_view);
        nameTextView.setText(currentDetail.getName());

        TextView phoneNoTextView = (TextView)listItemView.findViewById(R.id.phone_no_view);
        Long phoneNo= currentDetail.getPhoneNo();
        phoneNoTextView.setText(String.valueOf(phoneNo));

       ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
       if (currentDetail.hasImage()) {
           imageView.setImageResource(currentDetail.getImageResourceId());
           imageView.setVisibility(View.VISIBLE);
       }else
           imageView.setVisibility(View.GONE);

        return listItemView;
    }
}