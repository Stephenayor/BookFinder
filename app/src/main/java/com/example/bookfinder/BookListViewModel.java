package com.example.bookfinder;

import com.example.bookfinder.Model.BookExample;
import com.example.bookfinder.Model.BookItem;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookListViewModel extends ViewModel {
    private BookListRepository bookListRepository;
    private MutableLiveData<BookExample> mutableLiveData = new MutableLiveData<>();

    public BookListViewModel(){
        bookListRepository = new BookListRepository();
    }
    public MutableLiveData<BookExample> getBookList(String searchTitle, String searchAuthor) {
            bookListRepository.requestBooks(searchTitle, searchAuthor, mutableLiveData);
        return mutableLiveData;
    }
}