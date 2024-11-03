package com.example.biblioteca.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PerfilVista extends ViewModel {

    private final MutableLiveData<String> mText;

    public PerfilVista() {
        mText = new MutableLiveData<>();
        mText.setValue("Vista de su perfil");
    }

    public LiveData<String> getText() {
        return mText;
    }
}