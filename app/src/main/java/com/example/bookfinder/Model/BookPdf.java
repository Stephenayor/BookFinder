package com.example.bookfinder.Model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookPdf implements Parcelable
{

    @SerializedName("isAvailable")
    @Expose
    private Boolean isAvailable;
    @SerializedName("acsTokenLink")
    @Expose
    private String acsTokenLink;
    public final static Creator<BookPdf> CREATOR = new Creator<BookPdf>() {


        public BookPdf createFromParcel(android.os.Parcel in) {
            return new BookPdf(in);
        }

        public BookPdf[] newArray(int size) {
            return (new BookPdf[size]);
        }

    };

    protected BookPdf(android.os.Parcel in) {
        this.isAvailable = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.acsTokenLink = ((String) in.readValue((String.class.getClassLoader())));
    }

    public BookPdf() {
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
