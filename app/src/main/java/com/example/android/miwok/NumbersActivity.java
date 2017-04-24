package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "एक"));
        words.add(new Word("two", "दो"));
        words.add(new Word("three", "तीन"));
        words.add(new Word("four", "चार"));
        words.add(new Word("five", "पांच"));
        words.add(new Word("six", "छह"));
        words.add(new Word("seven", "सात"));
        words.add(new Word("eight", "आठ"));
        words.add(new Word("nine", "नौ"));
        words.add(new Word("ten", "दस"));


//        for(int i=0; i<0; i++) {
//            words.add(words.get(i%5));
//        }

        System.out.println("I am in NumbersActivity " + words.size());

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter itemsAdapter =
                new WordAdapter(this,
                        R.layout.list_item, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
