package com.example.bookfinder.Model;

import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReadingModes implements Parcelable
{

    @SerializedName("text")
    @Expose
    private Boolean text;
    @SerializedName("image")
    @Expose
    private Boolean image;
    public final static Creator<ReadingModes> CREATOR = new Creator<ReadingModes>() {


        public ReadingModes createFromParcel(android.os.Parcel in) {
            return new ReadingModes(in);
        }

        public ReadingModes[] newArray(int size) {
            return (new ReadingModes[size]);
        }

    };

    protected ReadingModes(android.os.Parcel in) {
        this.text = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.image = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public ReadingModes() {
    }

    public Boolean getText() {
        return text;
    }

    public void setText(Boolean text) {
        this.text = text;
    }

    public Boolean getImage() {
        return image;
    }

    public void setImage(Boolean image) {
        this.image = image;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(text);
        dest.writeValue(image);
    }

    public int describeContents() {
        return  0;
    }

}

