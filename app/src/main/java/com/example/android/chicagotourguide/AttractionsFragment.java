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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_categories, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(getString(R.string.attractions_cloudGate), 4.7, getString(R.string.attractions_cloudGate_description), R.drawable.attractions_cloudgate));
        items.add(new Item(getString(R.string.attractions_sheddAquarium), 4.5, getString(R.string.attractions_sheddAquarium_description), R.drawable.attractions_shedd_aquarium));
        items.add(new Item(getString(R.string.attractions_skyDeck), 4.4, getString(R.string.attractions_skyDeck_description), R.drawable.attractions_skydeck));
        items.add(new Item(getString(R.string.attractions_buckingham), 4.7, getString(R.string.attractions_buckingham_description), R.drawable.attractions_buckingham_fountain));
        items.add(new Item(getString(R.string.attractions_alderPlanetarium), 4.2, getString(R.string.attractions_alderPlanetarium_description), R.drawable.attractions_alder_planetarium));
        items.add(new Item(getString(R.string.attractions_artInstitute), 4.8, getString(R.string.attractions_artInstitute_description), R.drawable.attractions_art_institute));
        items.add(new Item(getString(R.string.attractions_fieldMuseum), 4.7, getString(R.string.attractions_fieldMuseum_description), R.drawable.attractions_field_museum));
        items.add(new Item(getString(R.string.attractions_riverWalk), 4.7, getString(R.string.attractions_riverWalk_description), R.drawable.attractions_chicago_riverwalk));
        items.add(new Item(getString(R.string.attractions_soldierField), 4.4, getString(R.string.attractions_soldierField_description), R.drawable.attractions_soldier_field));
        items.add(new Item(getString(R.string.attractions_360Chicago), 4.5, getString(R.string.attractions_360Chicago_description), R.drawable.attractions_360_chicago));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.itemsList);
        listView.setAdapter(adapter);

        return rootView;
    }
}