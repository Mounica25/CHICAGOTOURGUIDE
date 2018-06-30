package com.example.android.chicagotourguide;

public class Item {
    private String mTitle;
    private String mDescription;
    private double mRatingResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Item(String title, double ratingResourceId, String description) {
        mTitle = title;
        mDescription = description;
        mRatingResourceId = ratingResourceId;
    }

    public Item(String title, double ratingResourceId, String description, int imageResourceId) {
        mTitle = title;
        mDescription = description;
        mRatingResourceId = ratingResourceId;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public double getRatingResourceId() {
        return mRatingResourceId;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}