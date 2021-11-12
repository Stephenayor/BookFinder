package com.example.bookfinder;

import android.widget.EditText;

import com.example.bookfinder.Model.Book;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BookListViewModel extends ViewModel {
    private BookListRepository bookListRepository;
    private MutableLiveData<Book> mutableLiveData;

    public BookListViewModel(){
        bookListRepository = new BookListRepository();
    }
    public LiveData<Book> getBookList(EditText editText) {
        if(mutableLiveData==null){
            mutableLiveData = bookListRepository.requestBooks(editText);
        }
        return mutableLiveData;
    }
}