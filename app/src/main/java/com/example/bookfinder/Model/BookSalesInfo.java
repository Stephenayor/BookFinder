package com.example.bookfinder.Model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookSalesInfo implements Parcelable
{

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("saleability")
    @Expose
    private String saleability;
    @SerializedName("isEbook")
    @Expose
    private Boolean isEbook;
    public final static Creator<BookSalesInfo> CREATOR = new Creator<BookSalesInfo>() {


        public BookSalesInfo createFromParcel(android.os.Parcel in) {
            return new BookSalesInfo(in);
        }

        public BookSalesInfo[] newArray(int size) {
            return (new BookSalesInfo[size]);
        }

    };

    protected BookSalesInfo(android.os.Parcel in) {
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.saleability = ((String) in.readValue((String.class.getClassLoader())));
        this.isEbook = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public BookSalesInfo() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public Boolean getIsEbook() {
        return isEbook;
    }

    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(country);
        dest.writeValue(saleability);
        dest.writeValue(isEbook);
    }

    public int describeContents() {
        return  0;
    }

}

