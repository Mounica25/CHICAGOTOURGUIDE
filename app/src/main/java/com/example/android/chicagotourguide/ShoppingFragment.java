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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_categories, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.shopping_NEWCITY), 4.3, getString(R.string.shopping_NEWCITY_description)));
        items.add(new Item(getString(R.string.shopping_Greenheart), 4.9, getString(R.string.shopping_Greenheart_description)));
        items.add(new Item(getString(R.string.shopping_Luxury), 4.0, getString(R.string.shopping_Luxury_description)));
        items.add(new Item(getString(R.string.shopping_Bears), 4.3, getString(R.string.shopping_Bears_description)));
        items.add(new Item(getString(R.string.shopping_DutyFree), 2.0, getString(R.string.shopping_DutyFree_description)));
        items.add(new Item(getString(R.string.shopping_flowerShop), 4.4, getString(R.string.shopping_flowerShop_description)));
        items.add(new Item(getString(R.string.shopping_Popcorn), 4.5, getString(R.string.shopping_Popcorn_description)));
        items.add(new Item(getString(R.string.shopping_SuesHallmark), 3.1, getString(R.string.shopping_SuesHallmark_description)));
        items.add(new Item(getString(R.string.shopping_BodyShop), 3.0, getString(R.string.shopping_BodyShop_description)));
        items.add(new Item(getString(R.string.shopping_WineShop), 4.5, getString(R.string.shopping_WineShop_description)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.itemsList);
        listView.setAdapter(adapter);

        return rootView;
    }
}