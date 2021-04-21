package com.example.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

public class TouristSpot implements Parcelable {
    // mName-> Name of the locatioan
    // mShortDescription -> description to show on cards
    // mDescription -> detailed description
    private String mName,mShortDescription,mDescription,mAddress,mContact;
    private int mImageResourceId;

    //Constructor to be used for List

    public TouristSpot(String mName, String mShortDescription, int mImageResourceId,String mDescription,String mAddress,String mContact) {
        this.mName = mName;
        this.mShortDescription=mShortDescription;
        this.mImageResourceId = mImageResourceId;
        this.mDescription=mDescription;
        this.mAddress=mAddress;
        this.mContact=mContact;

    }

    //Constructor used for parcel
    public TouristSpot(Parcel parcel)
    {
        //read and set value from parcel
        this.mName = parcel.readString();
        this.mShortDescription=parcel.readString();
        this.mDescription = parcel.readString();
        this.mAddress=parcel.readString();
        this.mContact=parcel.readString();
        this.mImageResourceId=parcel.readInt();

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

    public String getAddress() {
        return mAddress;
    }

    public String getContact() {
        return mContact;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeString(mShortDescription);
        dest.writeString(mDescription);
        dest.writeString(mAddress);
        dest.writeString(mContact);
        dest.writeInt(mImageResourceId);
    }
    public static final Parcelable.Creator<TouristSpot> CREATOR = new Parcelable.Creator<TouristSpot>(){

        @Override
        public TouristSpot createFromParcel(Parcel source) {
            return new TouristSpot(source);
        }

        @Override
        public TouristSpot[] newArray(int size) {
            return new TouristSpot[0];
        }
    };
}
