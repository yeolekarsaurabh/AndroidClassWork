package ibm.com.layouts.ui.layouts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import ibm.com.layouts.R;

public class LayoutsFragment extends Fragment {

    private LayoutsViewModel layoutsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        layoutsViewModel =
                ViewModelProviders.of(this).get(LayoutsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_layouts, container, false);
        return root;
    }
}