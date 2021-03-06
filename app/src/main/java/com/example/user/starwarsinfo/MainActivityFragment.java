package com.example.user.starwarsinfo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayList<String> items;
    private ArrayAdapter<String> adapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ListView lvPelis = (ListView) view.findViewById(R.id.lvWars);

        items = new ArrayList<>();
        adapter = new ArrayAdapter<>(
                getContext(),
                R.layout.lv_wars_row,
                R.id.tvWars,
                items
        );
        lvPelis.setAdapter(adapter);

        return view;
    }
}
