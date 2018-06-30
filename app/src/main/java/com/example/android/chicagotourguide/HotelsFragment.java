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
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_categories, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.hotels_hilton), 4.3, getString(R.string.hotels_4StarRating_description), R.drawable.hotels_hilton));
        items.add(new Item(getString(R.string.hotels_Swissotel), 4.4, getString(R.string.hotels_4StarRating_description), R.drawable.hotels_swissotel));
        items.add(new Item(getString(R.string.hotels_Sheraton), 4.3, getString(R.string.hotels_4StarRating_description), R.drawable.hotels_sheraton));
        items.add(new Item(getString(R.string.hotels_Wyndham), 4.3, getString(R.string.hotels_3StarRating_description), R.drawable.hotels_wyndham));
        items.add(new Item(getString(R.string.hotels_Sofitel), 4.5, getString(R.string.hotels_4StarRating_description), R.drawable.hotels_sofitel));
        items.add(new Item(getString(R.string.hotels_Hyatt), 4.5, getString(R.string.hotels_4StarRating_description), R.drawable.hotels_hyatt));
        items.add(new Item(getString(R.string.hotels_Silversmith), 4.5, getString(R.string.hotels_4StarRating_description), R.drawable.hotels_silversmith));
        items.add(new Item(getString(R.string.hotels_Aloft), 4.5, getString(R.string.hotels_3StarRating_description), R.drawable.hotels_aloft));
        items.add(new Item(getString(R.string.hotels_Loews), 4.6, getString(R.string.hotels_4StarRating_description), R.drawable.hotels_loews));
        items.add(new Item(getString(R.string.hotels_Ambassador), 4.1, getString(R.string.hotels_4StarRating_description), R.drawable.hotels_ambassador));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.itemsList);
        listView.setAdapter(adapter);

        return rootView;
    }
}