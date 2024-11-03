package com.example.biblioteca.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.biblioteca.R;

public class PerfilVista extends ViewModel {
    private final MutableLiveData<Integer> imageResource;

    public PerfilVista() {
        imageResource = new MutableLiveData<>();
        imageResource.setValue(R.drawable.baseline_sentiment_very_satisfied_24);
    }

    public LiveData<Integer> getImageResource() {
        return imageResource;
    }
}
