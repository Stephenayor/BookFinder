package com.example.bookfinder.Model;

import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookSearchInfo implements Parcelable
{
    @SerializedName("textSnippet")
    @Expose
    private String textSnippet;
    public final static Creator<BookSearchInfo> CREATOR = new Creator<BookSearchInfo>() {

        public BookSearchInfo createFromParcel(android.os.Parcel in) {
            return new BookSearchInfo(in);
        }
        public BookSearchInfo[] newArray(int size) {
            return (new BookSearchInfo[size]);
        }

    };

    protected BookSearchInfo(android.os.Parcel in) {
        this.textSnippet = ((String) in.readValue((String.class.getClassLoader())));
    }

    public BookSearchInfo() {
    }

    public BookSearchInfo(String textSnippet) {
        super();
        this.textSnippet = textSnippet;
    }

    public String getTextSnippet() {
        return textSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(textSnippet);
    }

    public int describeContents() {
        return  0;
    }

}

