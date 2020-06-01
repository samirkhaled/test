package samir.com.testapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import samir.com.testapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Items extends Fragment {

    public Items() {
        // Required empty public constructor
    }

Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_items, container, false);

        button=view.findViewById(R.id.item_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main,
                        new ItemsDetails()).commit();

            }
        });

        return view;
    }
}
