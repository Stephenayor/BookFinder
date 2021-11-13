package com.example.bookfinder.Network;

import com.example.bookfinder.Model.Book;
import com.example.bookfinder.Model.BookItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BooksApi {
    String booksApiKey = "AIzaSyAq0jnQo2nh6DYPbNnWDx7NuRzPUpPjS-8";

    @GET("books/v1/volumes")
    Call<Book> getBooks();

    @GET("books/v1/volumes")
    Call<Book> getBookDetails(@Query("q") String Query, @Query("inauthor") String author);

//    @GET("books/v1/volumes")
//    Call<List<BookItem>> getBookDetails(@Query("q") String Query, @Query("inauthor") String author);
}
