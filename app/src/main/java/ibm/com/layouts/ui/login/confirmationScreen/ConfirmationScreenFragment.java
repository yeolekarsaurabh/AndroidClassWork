package ibm.com.layouts.ui.login.confirmationScreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ibm.com.layouts.R;

public class ConfirmationScreenFragment extends Fragment {

    private List<BooksModel> booksList = new ArrayList<>();
    private RecyclerView booksRecyclerView;
    private RecyclerViewVerticalListAdapter booksAdapter;
    String firstName;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.confirmation_screen, container, false);
        firstName = ConfirmationScreenFragmentArgs.fromBundle(getArguments()).getFirstName();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        populateHeader(view);
        populateRecyclerView(view);
    }

    private void populateHeader(View view){
        TextView headerTextView = view.findViewById(R.id.header_text_view);
        headerTextView.setText("Welcome " +firstName+ ", Books linked to your account");
    }

    private void populateRecyclerView(View view) {
        booksRecyclerView = view.findViewById(R.id.books_recycler_view);
        // add a divider after each item for more clarity
        booksRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        //Define the layout manager and adapter
        booksAdapter = new RecyclerViewVerticalListAdapter(booksList, getActivity());
        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        // Set the layout manager and adapter
        booksRecyclerView.setLayoutManager(verticalLayoutManager);
        booksRecyclerView.setAdapter(booksAdapter);

        //Populate the list that needs to be passed to the adapter.
        populateBooksList();
    }

    /**
     * Populate the list that needs to be passed to the adapter.
     */
    private void populateBooksList() {
        BooksModel book1 = new BooksModel("To Kill a Mockingbird ", R.mipmap.ic_launcher);
        BooksModel book2 = new BooksModel(" Middle march", R.mipmap.ic_launcher);
        BooksModel book3 = new BooksModel("Great Expectations", R.mipmap.ic_launcher);
        BooksModel book4 = new BooksModel("Gulliver's Travels", R.mipmap.ic_launcher);
        BooksModel book5 = new BooksModel("Absalom, Absalom! ", R.mipmap.ic_launcher);
        BooksModel book6 = new BooksModel("The Stranger", R.mipmap.ic_launcher);
        BooksModel book7 = new BooksModel("Jane Eyre", R.mipmap.ic_launcher);
        BooksModel book8 = new BooksModel(" The Trial", R.mipmap.ic_launcher);

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);

        //Notify the changes
        booksAdapter.notifyDataSetChanged();
    }
}
