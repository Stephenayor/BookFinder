package com.example.bookfinder;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bookfinder.Model.Book;
import com.example.bookfinder.Model.BookExample;
import com.example.bookfinder.Model.BookItem;
import com.example.bookfinder.Network.BookFinderRetrofitClientInstance;
import com.example.bookfinder.Network.BooksApi;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookListRepository {

    public void requestBooks(String searchTitle, String searchAuthor, MutableLiveData<BookExample> mutableLiveData) {
        BooksApi booksApiService = BookFinderRetrofitClientInstance.getRetrofitInstance().create(BooksApi.class);
        Call<BookExample> call = booksApiService.getBookDetails(searchTitle, searchTitle, searchAuthor);
        call.enqueue(new Callback<BookExample>() {
            @Override
            public void onResponse(Call<BookExample> call, Response<BookExample> response) {
                Log.d("BookList", "Books Arriving");
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<BookExample> call, Throwable t) {
                t.getMessage();
            }
        });
    }
}
