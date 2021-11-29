package com.example.bookfinder.Network;

import com.example.bookfinder.Model.Book;
import com.example.bookfinder.Model.BookAccess;
import com.example.bookfinder.Model.BookExample;
import com.example.bookfinder.Model.BookItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BooksApi {
    String booksApiKey = "AIzaSyAq0jnQo2nh6DYPbNnWDx7NuRzPUpPjS-8";

    @GET("books/v1/volumes?q=search+terms:&"+booksApiKey)
    Call<BookExample> getBooks();


    @GET("books/v1/volumes")
    Call<BookExample> getBookDetails(@Query(value = "q") String query,
                                     @Query("intitle") String searchTitle, @Query("inauthor") String author);
}
