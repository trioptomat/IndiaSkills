package com.example.cakes3.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    RecyclerView rv_data;
    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");


    }

    public LiveData<String> getText() {
        return mText;
    }
}