package com.example.bookfinder.Model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookIndustryIdentifier implements Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("identifier")
    @Expose
    private String identifier;
    public final static Creator<BookIndustryIdentifier> CREATOR = new Creator<BookIndustryIdentifier>() {


        public BookIndustryIdentifier createFromParcel(android.os.Parcel in) {
            return new BookIndustryIdentifier(in);
        }

        public BookIndustryIdentifier[] newArray(int size) {
            return (new BookIndustryIdentifier[size]);
        }

    };

    protected BookIndustryIdentifier(android.os.Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.identifier = ((String) in.readValue((String.class.getClassLoader())));
    }

    public BookIndustryIdentifier() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(identifier);
    }

    public int describeContents() {
        return  0;
    }

}

