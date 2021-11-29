package com.example.bookfinder.Model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookExample implements Parcelable {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("totalItems")
    @Expose
    private Integer totalItems;
    @SerializedName("items")
    @Expose
    private List<BookItem> bookItem = new ArrayList<BookItem>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<BookExample> CREATOR = new Creator<BookExample>() {

        public BookExample createFromParcel(android.os.Parcel in) {
            return new BookExample(in);
        }

        public BookExample[] newArray(int size) {
            return (new BookExample[size]);
        }

    };

    protected BookExample(android.os.Parcel in) {
        this.kind = ((String) in.readValue((String.class.getClassLoader())));
        this.totalItems = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.bookItem, (com.example.bookfinder.Model.BookExample.class.getClassLoader()));
    }

    public BookExample() {
    }

    public BookExample(String kind, Integer totalItems, List<BookItem> items) {
        super();
        this.kind = kind;
        this.totalItems = totalItems;
        this.bookItem = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public List<BookItem> getBookItem() {
        return bookItem;
    }

    public void setBookItem(List<BookItem> bookItem) {
        this.bookItem = bookItem;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(kind);
        dest.writeValue(totalItems);
        dest.writeList(bookItem);
    }

    public int describeContents() {
        return 0;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

