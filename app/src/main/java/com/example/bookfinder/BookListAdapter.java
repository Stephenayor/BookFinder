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
import com.example.bookfinder.Model.BookItem;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookViewHolder> {
    private LayoutInflater layoutInflater;
    private Context context;
    private List<BookItem> bookItemList;

    public BookListAdapter(List<BookItem> bookItemList, Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.bookItemList = bookItemList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_list_item, parent, false);
        return new BookViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        if (bookItemList != null){
            loadBookImages(holder, position);
            holder.titleTextView.setText(bookItemList.get(position).getVolumeInfo().getTitle());
            List<String> authors = bookItemList.get(position).getVolumeInfo().getAuthors();
            holder.authorTextView.setText(String.valueOf(authors));
        }
    }

    private void loadBookImages(@NonNull BookViewHolder holder, int position) {
        if (bookItemList.get(position).getVolumeInfo().getImageLinks() != null){
        Glide.with(context).
                load(bookItemList.get(position).getVolumeInfo().
                getImageLinks().getSmallThumbnail()).
                into(holder.bookImageView);}
        else {
            Glide.with(context).load(R.drawable.emptybookview).
                    into(holder.bookImageView);
        }
    }

    @Override
    public int getItemCount() {
        if (bookItemList==null){
            return 0;
        }
        return bookItemList.size();
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
