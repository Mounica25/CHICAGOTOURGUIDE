package com.example.android.chicagotourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private static final String LOG_TAG = ItemAdapter.class.getSimpleName();

    public ItemAdapter(Activity context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.categorylist_item, parent, false);
        }

        Item currentItem = getItem(position);

        TextView place_textView = (TextView) listItemView.findViewById(R.id.placetitle);
        place_textView.setText(currentItem.getTitle());

        TextView description_textView = (TextView) listItemView.findViewById(R.id.placedescription);
        description_textView.setText(currentItem.getDescription());

        final RatingBar rate = (RatingBar) listItemView.findViewById(R.id.rating_bar);
        rate.setNumStars(5);
        rate.setStepSize((float) 0.5);
        rate.setRating((float) currentItem.getRatingResourceId());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageId);
        if (currentItem.hasImage()) {
            iconView.setImageResource(currentItem.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}