package com.example.biblioteca.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BusquedaVista extends ViewModel {
    private final MutableLiveData<String> mText;

    public BusquedaVista() {
        mText = new MutableLiveData<>();
        mText.setValue("Vista de su busqueda");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
