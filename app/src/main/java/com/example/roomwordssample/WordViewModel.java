package com.example.roomwordssample;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private  WordRepository mRepository;
    private LiveData<List<word>> mAllwords;

    public WorldViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllwords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllwords;
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }
}
