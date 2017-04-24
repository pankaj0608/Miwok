package com.example.android.miwok;

/**
 * Created by pankaj on 4/23/2017.
 */
public class Word {

    String eng;
    String hindi;
    String image;

    Word(String aEng, String aHindi) {
        this.eng = aEng;
        this.hindi = aHindi;
        this.image = "\"number_";
    }

    public String getEng() {
        return eng;
    }

    public String getHindi() {

        return hindi;
    }

    public String getImage() {
        return  this.image + this.eng + ".png";
    }
}
