package com.example.bookfinder;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.bookfinder.Model.BookItem;

import java.util.List;

public class BookDetailsFragment extends Fragment {
    public static final String EXTRA_BOOKS = "books";
    private BookItem bookItem;
    private ImageView bookDetailsImageView;
    private TextView bookDetailsTextView;
    private TextView authorDetailsTextView;
    private TextView publisherTextView;
    private TextView publisherDateTextView;
    private TextView numberOfPagesTextView;
    private TextView descriptionTextView;

    public BookDetailsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_details, container, false);
        bookDetailsImageView = view.findViewById(R.id.book_image);
        bookDetailsTextView = view.findViewById(R.id.book_title);
        authorDetailsTextView = view.findViewById(R.id.author_text_view);
        publisherTextView = view.findViewById(R.id.publisher_text_view);
        publisherDateTextView = view.findViewById(R.id.publisherDate_text_view);
        numberOfPagesTextView = view.findViewById(R.id.pages_text_view);
        descriptionTextView = view.findViewById(R.id.description);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            bookItem = bundle.getParcelable(EXTRA_BOOKS);
        } else {
            throw new NullPointerException("BookDetail Fragment must receive a bookItem");
        }
        loadBookDetailsImage();
        bookDetailsTextView.setText(bookItem.getVolumeInfo().getTitle());
        List<String> bookAuthors = bookItem.getVolumeInfo().getAuthors();
        authorDetailsTextView.setText(String.valueOf(bookAuthors));
        publisherTextView.setText(bookItem.getVolumeInfo().getPublisher());
        publisherDateTextView.setText(bookItem.getVolumeInfo().getPublishedDate());
        descriptionTextView.setText(bookItem.getVolumeInfo().getDescription());
        return view;
    }

    private void loadBookDetailsImage() {
        if (bookItem.getVolumeInfo().getImageLinks().getSmallThumbnail() != null) {
            Glide.with(this).
                    load(bookItem.getVolumeInfo().getImageLinks().getSmallThumbnail())
                    .into(bookDetailsImageView);
        }
    }
}