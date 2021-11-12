package com.example.bookfinder.Model;

import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class BookExample implements Parcelable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("totalItems")
    @Expose
    private Integer totalItems;
    @SerializedName("items")
    @Expose
    private List<BookItem> items = null;
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
        in.readList(this.items, (com.example.bookfinder.Model.BookItem.class.getClassLoader()));
    }

    public BookExample() {
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

    public List<BookItem> getItems() {
        return items;
    }

    public void setItems(List<BookItem> items) {
        this.items = items;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(kind);
        dest.writeValue(totalItems);
        dest.writeList(items);
    }

    public int describeContents() {
        return  0;
    }

}

