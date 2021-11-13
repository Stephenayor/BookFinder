package com.example.bookfinder;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.bookfinder.Model.Book;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookViewHolder> {
    private Book books;
    private LayoutInflater layoutInflater;
    private Context context;
    private List<Book> bookList;

    public BookListAdapter(Book books, Context context) {
        this.books = books;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list_item, parent, false);
        return new BookViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        if (books != null){
            Glide.with(context).
                    load(books.getImageLinks()).
                    into(holder.bookImageView);
            holder.titleTextView.setText(books.getTitle());
            Log.d("Book title", "Title");
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{
        private TextView titleTextView;
        private TextView authorTextView;
        private ImageView bookImageView;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.book_title);
            authorTextView = itemView.findViewById(R.id.book_author_view);
            bookImageView = itemView.findViewById(R.id.book_imageView);
        }
    }
}
