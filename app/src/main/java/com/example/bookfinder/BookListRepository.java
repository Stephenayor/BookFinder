package com.example.bookfinder;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bookfinder.Model.Book;
import com.example.bookfinder.Network.BookFinderRetrofitClientInstance;
import com.example.bookfinder.Network.BooksApi;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookListRepository {

    public MutableLiveData<Book> requestBooks(EditText editText){
        String searchTitle = editText.getText().toString();
        String searchAuthor = editText.getText().toString();
        final MutableLiveData<Book> mutableLiveData = new MutableLiveData<>();
        BooksApi booksApiService = BookFinderRetrofitClientInstance.getRetrofitInstance().create(BooksApi.class);
        Call<Book> call = booksApiService.getBookDetails(searchTitle, searchAuthor);
        call.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                mutableLiveData.setValue(response.body());
                Log.d("BookList", "Books Arriving");
            }
            @Override
            public void onFailure(Call<Book> call, Throwable t) {
                t.getMessage();
            }});
        return mutableLiveData;
    }
}
