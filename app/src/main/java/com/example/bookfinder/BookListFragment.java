package com.example.bookfinder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bookfinder.Model.Book;
import com.example.bookfinder.Network.BookFinderRetrofitClientInstance;
import com.example.bookfinder.Network.BooksApi;

public class BookListFragment extends Fragment {
    private EditText editText;
    private Button searchButton;
    private String searchTitle;
    

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_list, container, false);
        searchButton = view.findViewById(R.id.search_button);
        editText = view.findViewById(R.id.editText);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchTitle = editText.getText().toString();
                String searchAuthor = editText.getText().toString();
        BooksApi booksApiService = BookFinderRetrofitClientInstance.getRetrofitInstance().create(BooksApi.class);
        Call<Book> call = booksApiService.getBookDetails(searchTitle,
                searchAuthor);
        call.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                Toast.makeText(getContext(), "BOOKS ARRIVING", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Book> call, Throwable t) {

            }});
        }});
        return view;
    }
}