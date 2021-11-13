package com.example.bookfinder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bookfinder.Model.Book;
import com.example.bookfinder.Network.BookFinderRetrofitClientInstance;
import com.example.bookfinder.Network.BooksApi;

import java.util.List;

public class BookListFragment extends Fragment {
    private EditText editText;
    private Button searchButton;
    private BookListAdapter bookListAdapter;
    private RecyclerView recyclerView;
    private List<Book> bookList1;

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
        recyclerView = view.findViewById(R.id.book_list_recyclerView);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BookListViewModel bookListViewModel = new BookListViewModel();
                bookListViewModel.getBookList(editText).observe(getViewLifecycleOwner(), new Observer<Book>() {
                    @Override
                    public void onChanged(Book book) {
                        displayBookList(book);
                    }
                });
        }});
        return view;
    }
    private void displayBookList(Book book) {
        bookListAdapter = new BookListAdapter(book, getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(bookListAdapter);
    }
}