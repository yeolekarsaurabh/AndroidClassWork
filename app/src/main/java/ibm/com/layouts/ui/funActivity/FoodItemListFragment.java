package ibm.com.layouts.ui.funActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ibm.com.layouts.MainActivity;
import ibm.com.layouts.R;

public class FoodItemListFragment extends Fragment {

    RecyclerView recyclerView;
    int foodImages[] = {R.drawable.apple, R.drawable.banana, R.drawable.cranberry, R.drawable.grapes,
            R.drawable.kiwi, R.drawable.mango, R.drawable.orange, R.drawable.pears, R.drawable.pineapple, R.drawable.watermelon};
    String name[];
    TextView heading;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Food Item List");
        View rootView = inflater.inflate(R.layout.fragment_food_item_list, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view);
        name = getResources().getStringArray(R.array.fruits);
        heading = rootView.findViewById(R.id.heading);
        heading.setText("Welcome " + getArguments().getString("name") + ":\nFollowing is the list of items \nlinked to your account:");
        FoodDataAdapter foodDataAdapter = new FoodDataAdapter(getContext(), name, foodImages);
        recyclerView.setAdapter(foodDataAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return rootView;
    }
}
