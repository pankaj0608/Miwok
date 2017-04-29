package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "एक", R.drawable.number_one));
        words.add(new Word("two", "दो", R.drawable.number_two));
        words.add(new Word("three", "तीन", R.drawable.number_three));
        words.add(new Word("four", "चार", R.drawable.number_four));
        words.add(new Word("five", "पांच", R.drawable.number_five));
        words.add(new Word("six", "छह", R.drawable.number_six));
        words.add(new Word("seven", "सात", R.drawable.number_seven));
        words.add(new Word("eight", "आठ", R.drawable.number_eight));
        words.add(new Word("nine", "नौ", R.drawable.number_nine));
        words.add(new Word("ten", "दस", R.drawable.number_ten));


//        for(int i=0; i<0; i++) {
//            words.add(words.get(i%5));
//        }

        System.out.println("I am in NumbersActivity " + words.size());

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter itemsAdapter =
                new WordAdapter(this,
                        R.layout.list_item, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
