package com.example.bookfinder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bookfinder.Model.Book;
import com.example.bookfinder.Model.BookAccess;
import com.example.bookfinder.Model.BookExample;
import com.example.bookfinder.Model.BookItem;
import com.example.bookfinder.Network.BookFinderRetrofitClientInstance;
import com.example.bookfinder.Network.BooksApi;

import java.util.ArrayList;
import java.util.List;

public class BookListFragment extends Fragment implements BookListAdapter.ItemClickListener {
    private EditText editText;
    private Button searchButton;
    private BookListAdapter bookListAdapter;
    private RecyclerView recyclerView;
    private List<BookItem> bookItemList;
    private BookListViewModel bookListViewModel;
    private String searchTitle;
    private String searchAuthor;
    private TextView textView;
    private ProgressBar progressBar;

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
        progressBar = view.findViewById(R.id.loading_progress_bar);

        bookListViewModel = new ViewModelProvider(this).get(BookListViewModel.class);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
                searchTitle = editText.getText().toString();
                searchAuthor = editText.getText().toString();
                bookListViewModel.getBookList(searchTitle, searchAuthor).observe(getViewLifecycleOwner(), new Observer<BookExample>() {
                    @Override
                    public void onChanged(BookExample book) {
                        progressBar.setVisibility(View.INVISIBLE);
                        displayBookList(book.getBookItem());
                    }
                });
            }
        });
        return view;
    }

    private void displayBookList(List<BookItem> bookItem) {
        bookListAdapter = new BookListAdapter(bookItem, getContext(),this);
        bookListAdapter.notifyDataSetChanged();
        recyclerView.setHasFixedSize(true);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(bookListAdapter);
    }

    @Override
    public void onBookItemClick(BookItem bookItem) {
        Fragment bookDetailsFragment = new BookDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("books", bookItem);
        bookDetailsFragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction().remove(new BookListFragment())
                .replace(R.id.fragment_container_view, bookDetailsFragment)
                .setReorderingAllowed(true)
                .addToBackStack(null)
                .commit();
    }
}