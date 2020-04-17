package ibm.com.layouts.ui.login.confirmationScreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ibm.com.layouts.R;

public class RecyclerViewVerticalListAdapter extends RecyclerView.Adapter<RecyclerViewVerticalListAdapter.BookViewHolder> {
    private List<BooksModel> booksList;
    Context context;

    public RecyclerViewVerticalListAdapter(List<BooksModel> booksModelList, Context context) {
        this.booksList = booksModelList;
        this.context = context;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View bookLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.confirmation_screen_book_layout, parent, false);
        BookViewHolder bookViewHolder = new BookViewHolder(bookLayoutView);
        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, final int position) {
        holder.bookImageView.setImageResource(booksList.get(position).getBookImage());
        holder.bookTextView.setText(booksList.get(position).getBookName());
        holder.booksLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bookName = booksList.get(position).getBookName();
                Toast.makeText(context, bookName + " is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return booksList.size();
    }


    public class BookViewHolder extends RecyclerView.ViewHolder {
        ImageView bookImageView;
        TextView bookTextView;
        ConstraintLayout booksLayout;

        public BookViewHolder(View view) {
            super(view);
            bookImageView = view.findViewById(R.id.book_image_view);
            bookTextView = view.findViewById(R.id.book_name_text_view);
            booksLayout = view.findViewById(R.id.books_layout);
        }
    }
}