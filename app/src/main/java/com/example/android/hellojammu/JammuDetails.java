package com.example.android.hellojammu;

/**
 * Created by nalin on 01-May-17.
 */

public class JammuDetails {

    private String mPlacesInJammu;

    private String mPlacesColor;


    public JammuDetails(String placesInJammu, String placesColor){
        mPlacesInJammu = placesInJammu;
        mPlacesColor = placesColor;
    }

    public String getPlacesInJammu(){
        return mPlacesInJammu;
    }

    public String getPlacesColor(){
        return mPlacesColor;
    }


}
