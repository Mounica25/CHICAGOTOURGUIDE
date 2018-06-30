package com.example.android.chicagotourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_categories, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.food_Monteverde), 4.7, getString(R.string.food_Monteverde_description), R.drawable.food_monteverde));
        items.add(new Item(getString(R.string.food_avec), 4.6, getString(R.string.food_avec_description), R.drawable.food_avec));
        items.add(new Item(getString(R.string.food_boka), 4.7, getString(R.string.food_boka_description), R.drawable.food_boka));
        items.add(new Item(getString(R.string.food_Viaggio), 4.7, getString(R.string.food_Viaggio_description), R.drawable.food_viaggio));
        items.add(new Item(getString(R.string.food_smoque), 4.7, getString(R.string.food_smoque_description), R.drawable.food_smoque));
        items.add(new Item(getString(R.string.food_berghOff), 4.4, getString(R.string.food_berghOff_description), R.drawable.food_berghoff));
        items.add(new Item(getString(R.string.food_italian), 4.3, getString(R.string.food_italian_description), R.drawable.food_italian));
        items.add(new Item(getString(R.string.food_gibsons), 4.6, getString(R.string.food_gibsons_description), R.drawable.food_gibsons));
        items.add(new Item(getString(R.string.food_Parachute), 4.5, getString(R.string.food_Parachute_description), R.drawable.food_parachute));
        items.add(new Item(getString(R.string.food_fatRice), 4.5, getString(R.string.food_fatRice_description), R.drawable.food_fatrice));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.itemsList);
        listView.setAdapter(adapter);

        return rootView;
    }
}