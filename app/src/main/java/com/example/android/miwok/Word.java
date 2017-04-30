package com.example.android.miwok;

/**
 * Created by pankaj on 4/23/2017.
 */
public class Word {

    String eng;
    String hindi;
    int imageResourceId;
    int audioResourceId;

    Word(String aEng, String aHindi, int aImageResourceId, int aAudioResourceId) {
        this.eng = aEng;
        this.hindi = aHindi;
        this.imageResourceId = aImageResourceId;
        this.audioResourceId = aAudioResourceId;
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

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
