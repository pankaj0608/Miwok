package com.example.android.miwok;

/**
 * Created by pankaj on 4/23/2017.
 */
public class Word {

    String eng;
    String hindi;
    int imageResourceId;

    Word(String aEng, String aHindi, int aImageResourceId) {
        this.eng = aEng;
        this.hindi = aHindi;
        this.imageResourceId = aImageResourceId;
    }

    public String getEng() {
        return eng;
    }

    public String getHindi() {

        return hindi;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
