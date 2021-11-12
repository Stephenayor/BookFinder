package com.example.bookfinder.Model;

import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookPub implements Parcelable
{

    @SerializedName("isAvailable")
    @Expose
    private Boolean isAvailable;
    @SerializedName("acsTokenLink")
    @Expose
    private String acsTokenLink;
    public final static Creator<BookPub> CREATOR = new Creator<BookPub>() {


        public BookPub createFromParcel(android.os.Parcel in) {
            return new BookPub(in);
        }

        public BookPub[] newArray(int size) {
            return (new BookPub[size]);
        }

    };

    protected BookPub(android.os.Parcel in) {
        this.isAvailable = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.acsTokenLink = ((String) in.readValue((String.class.getClassLoader())));
    }

    public BookPub() {
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getAcsTokenLink() {
        return acsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(isAvailable);
        dest.writeValue(acsTokenLink);
    }

    public int describeContents() {
        return  0;
    }

}
