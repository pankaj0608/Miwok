package com.example.android.miwok;

/**
 * Created by pankaj on 4/23/2017.
 */
public class Word {

    String eng;
    String hindi;

    Word(String aEng, String aHindi) {
        this.eng = aEng;
        this.hindi = aHindi;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getHindi() {
        return hindi;
    }

    public void setHindi(String hindi) {
        this.hindi = hindi;
    }
}
