package es.studium.davinciapp.ui.Inventor;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import es.studium.davinciapp.R;
import es.studium.davinciapp.ui.home.HomeViewModel;

public class inventor extends Fragment {

    private InventorViewModel inventorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        inventorViewModel =
                ViewModelProviders.of(this).get(InventorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_inventor, container, false);
        final TextView textView = root.findViewById(R.id.text_inventor);
        inventorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}