package com.example.bookfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.bookfinder.Model.Book;
import com.example.bookfinder.Network.BookFinderRetrofitClientInstance;
import com.example.bookfinder.Network.BooksApi;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, BookListFragment.class, null)
                    .commit();}


}}
