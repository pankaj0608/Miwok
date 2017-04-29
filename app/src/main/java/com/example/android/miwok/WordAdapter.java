package com.example.android.miwok;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pankaj on 4/23/2017.
 */
public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Activity context, int resource, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, resource, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        if(position%2 ==0)
            listItemView.setBackgroundColor(Color.parseColor("#EDEEF9"));
        else
            listItemView.setBackgroundColor(Color.parseColor("#FFFFFF"));

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView engTextView = (TextView) listItemView.findViewById(R.id.engText);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        engTextView.setText(currentWord.getEng());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView hindiTextView = (TextView) listItemView.findViewById(R.id.hindiText);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        hindiTextView.setText(currentWord.getHindi());
        //hindiTextView.setBackgroundColor(Color.RED);
        // Find the TextView in the list_item.xml layout with the ID version_number
//        TextView posText = (TextView) listItemView.findViewById(R.id.posText);
//        // Get the version number from the current AndroidFlavor object and
//        // set this text on the number TextView
//        posText.setText("");

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentWord.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
