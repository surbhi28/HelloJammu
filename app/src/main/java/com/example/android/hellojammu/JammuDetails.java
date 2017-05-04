package com.example.android.hellojammu;

/**
 * Created by nalin on 01-May-17.
 */

public class JammuDetails {

    private String mPlacesInJammu;

    private int mPlacesColorId;


    public JammuDetails(String placesInJammu, int placesColorId) {
        mPlacesInJammu = placesInJammu;
        mPlacesColorId = placesColorId;
    }

    public String getPlacesInJammu(){
        return mPlacesInJammu;
    }

    public int getPlacesColorId() {
        return mPlacesColorId;
    }


}
