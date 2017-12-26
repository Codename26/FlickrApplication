package com.example.user.flickrapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 26.12.2017.
 */

public class GalleryItem {
    @SerializedName("title")
    String mCaption;
    @SerializedName("id")
    String mId;
    @SerializedName("url_s")
    String mUrl;


    @Override
    public String toString() {
        return mCaption;
    }

    public String getmCaption() {
        return mCaption;
    }

    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
