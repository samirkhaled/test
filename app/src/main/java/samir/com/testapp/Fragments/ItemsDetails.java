package samir.com.testapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import samir.com.testapp.MainActivity;
import samir.com.testapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemsDetails extends Fragment {

    public ItemsDetails() {
        // Required empty public constructor
    }

Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
View view= inflater.inflate(R.layout.fragment_items_details, container, false);
button =view.findViewById(R.id.logout);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(getActivity(), MainActivity.class));
    }
});

return  view;
    }
}
