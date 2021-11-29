package com.example.bookfinder.Model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BookItem implements Parcelable
{
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("etag")
    @Expose
    private String etag;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("book")
    @Expose
    private Book book;
    @SerializedName("saleInfo")
    @Expose
    private BookSalesInfo saleInfo;
    @SerializedName("accessInfo")
    @Expose
    private BookAccess accessInfo;
    @SerializedName("searchInfo")
    @Expose
    private BookSearchInfo searchInfo;
    @SerializedName("volumeInfo")
    @Expose
    private VolumeInfo volumeInfo;
    public final static Creator<BookItem> CREATOR = new Creator<BookItem>() {

        @SuppressWarnings({
        })
        public BookItem createFromParcel(Parcel in) {
            return new BookItem(in);
        }

        public BookItem[] newArray(int size) {
            return (new BookItem[size]);
        }

    };

    protected BookItem(android.os.Parcel in) {
        this.kind = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.etag = ((String) in.readValue((String.class.getClassLoader())));
        this.selfLink = ((String) in.readValue((String.class.getClassLoader())));
        this.book = ((Book) in.readValue(( Book.class.getClassLoader())));
        this.saleInfo = ((BookSalesInfo) in.readValue((BookSalesInfo.class.getClassLoader())));
        this.accessInfo = ((BookAccess) in.readValue((BookAccess.class.getClassLoader())));
        this.searchInfo = ((BookSearchInfo) in.readValue((BookSearchInfo.class.getClassLoader())));
    }

    public BookItem() {
    }

    public BookItem(String kind, String id, String etag, String selfLink, Book book, BookSalesInfo saleInfo,
                    BookAccess accessInfo, BookSearchInfo searchInfo) {
        super();
        this.kind = kind;
        this.id = id;
        this.etag = etag;
        this.selfLink = selfLink;
        this.book = book;
        this.saleInfo = saleInfo;
        this.accessInfo = accessInfo;
        this.searchInfo = searchInfo;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookSalesInfo getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(BookSalesInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public BookAccess getAccessInfo() {
        return accessInfo;
    }

    public void setAccessInfo(BookAccess accessInfo) {
        this.accessInfo = accessInfo;
    }

    public BookSearchInfo getSearchInfo() {
        return searchInfo;
    }

    public void setSearchInfo(BookSearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(kind);
        dest.writeValue(id);
        dest.writeValue(etag);
        dest.writeValue(selfLink);
        dest.writeValue(book);
        dest.writeValue(saleInfo);
        dest.writeValue(accessInfo);
        dest.writeValue(searchInfo);
    }
    public int describeContents() {
        return  0;
    }
}

