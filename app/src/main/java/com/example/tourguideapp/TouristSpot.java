package com.example.tourguideapp;

//TODO: Modify the class for proper details in fragments

public class TouristSpot {
    // mName-> Name of the locatioan
    // mShortDescription -> description to show on cards
    // mDescription -> detailed description
    private String mName,mShortDescription,mDescription;
    private int mImageResourceId;

    //Constructor to be used for List
    public TouristSpot(String mName,String mShortDescription) {
        this.mName = mName;
        this.mShortDescription=mShortDescription;
    }
    public TouristSpot(String mName, String mShortDescription, int mImageResourceId) {
        this.mName = mName;
        this.mShortDescription=mShortDescription;
        this.mImageResourceId = mImageResourceId;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getShortDescription() {
        return mShortDescription;
    }

    public void setShortDescription(String mShortDescription) {
        this.mShortDescription = mShortDescription;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
