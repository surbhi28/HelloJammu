package com.example.android.hellojammu;

/**
 * Created by nalin on 21-Apr-17.
 */

public class Details {

    private String mName;

    private long mPhoneNo;

    /* Resource Id of Image */
    private int mImageResourceId = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Details(String name,long phoneNo){
        mName = name;
        mPhoneNo = phoneNo;
    }
    public Details(String name,long phoneNo,int imageResourceId){
        mName = name;
        mPhoneNo = phoneNo;
        mImageResourceId = imageResourceId;
    }
    public String getName(){
        return mName;
    }
    public long getPhoneNo(){
        return mPhoneNo;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;

    }
}
