package com.example.bookfinder.Model;

import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookImageLinks implements Parcelable
{

    @SerializedName("smallThumbnail")
    @Expose
    private String smallThumbnail;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    public final static Creator<BookImageLinks> CREATOR = new Creator<BookImageLinks>() {


        public BookImageLinks createFromParcel(android.os.Parcel in) {
            return new BookImageLinks(in);
        }

        public BookImageLinks[] newArray(int size) {
            return (new BookImageLinks[size]);
        }

    };

    protected BookImageLinks(android.os.Parcel in) {
        this.smallThumbnail = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnail = ((String) in.readValue((String.class.getClassLoader())));
    }

    public BookImageLinks() {
    }

    public BookImageLinks(String smallThumbnail, String thumbnail) {
        super();
        this.smallThumbnail = smallThumbnail;
        this.thumbnail = thumbnail;
    }

    public String getSmallThumbnail() {
        return smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(smallThumbnail);
        dest.writeValue(thumbnail);
    }

    public int describeContents() {
        return  0;
    }

}

