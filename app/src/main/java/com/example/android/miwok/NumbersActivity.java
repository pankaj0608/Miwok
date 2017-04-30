package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "एक", R.drawable.number_one));
        words.add(new Word("Two", "दो", R.drawable.number_two));
        words.add(new Word("Three", "तीन", R.drawable.number_three));
        words.add(new Word("Four", "चार", R.drawable.number_four));
        words.add(new Word("Five", "पांच", R.drawable.number_five));
        words.add(new Word("Six", "छह", R.drawable.number_six));
        words.add(new Word("Seven", "सात", R.drawable.number_seven));
        words.add(new Word("Eight", "आठ", R.drawable.number_eight));
        words.add(new Word("Nine", "नौ", R.drawable.number_nine));
        words.add(new Word("Ten", "दस", R.drawable.number_ten));


//        for(int i=0; i<0; i++) {
//            words.add(words.get(i%5));
//        }

        System.out.println("I am in NumbersActivity " + words.size());

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        WordAdapter itemsAdapter =
                new WordAdapter(this,
                        R.layout.list_item, words, R.color.category_numbers, R.color.tan_background);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }

    public void playMyNumber(View v) {
        System.out.println("I am Here " + v.getY());

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.one);
        mediaPlayer.start();
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
    }
}
