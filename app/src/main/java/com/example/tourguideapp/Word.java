package com.example.tourguideapp;

public class Word {
    private String mTitle;
    private String mDescription;
    private int mImageResourceId;
    private String mLocation;

    public Word(String title, String Description, int ImageResourceId,String Location){
        mTitle=title;
        mDescription=Description;
        mImageResourceId=ImageResourceId;
        mLocation = Location;
    }
        public String getTitle()
        {
            return mTitle;
        }
        public String getDescription()
        {
            return mDescription;
        }
        public int getImage()
        {
            return mImageResourceId;
        }
        public String getLocation(){
        return mLocation;
        }
}
