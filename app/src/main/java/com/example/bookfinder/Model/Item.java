//package com.example.bookfinder.Model;
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import java.util.List;
//
//public class Item implements Parcelable {
//
////    private List<BookItem> items;
////    private Book book;
////
////    protected Item(Parcel in) {
////        this.items = ((List<BookItem>) in.readValue((String.class.getClassLoader())));
////    }
////
////    public static final Creator<Item> CREATOR = new Creator<Item>() {
////        @Override
////        public Item createFromParcel(Parcel in) {
////            return new Item(in);
////        }
////
////        @Override
////        public Item[] newArray(int size) {
////            return new Item[size];
////        }
////    };
////
//////    protected Item(android.os.Parcel in) {
//////        this.kind = ((String) in.readValue((String.class.getClassLoader())));
//////        this.id = ((String) in.readValue((String.class.getClassLoader())));
//////        this.etag = ((String) in.readValue((String.class.getClassLoader())));
//////        this.selfLink = ((String) in.readValue((String.class.getClassLoader())));
//////        this.book = ((Book) in.readValue((Book.class.getClassLoader())));
//////        this.saleInfo = ((BookSalesInfo) in.readValue((BookSalesInfo.class.getClassLoader())));
//////        this.accessInfo = ((BookAccess) in.readValue((BookAccess.class.getClassLoader())));
//////        this.searchInfo = ((BookSearchInfo) in.readValue((BookSearchInfo.class.getClassLoader())));
//////    }
////
////    public List<BookItem> getItems() {
////        return items;
////    }
////    public void setItems(List<BookItem> items) {
////        this.items = items;
////    }
////
////    public Book getBook() {
////        return book;
////    }
////
////    public void setBook(Book book) {
////        this.book = book;
////    }
////
////    @Override
////    public int describeContents() {
////        return 0;
////    }
////
////    @Override
////    public void writeToParcel(Parcel parcel, int i) {
////        parcel.writeTypedList(items);
////    }
//}
