package com.example.reseptron.ui.addition;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdditionViewModel extends ViewModel {


    MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    private int result = 0;


    public void getResult(int a, int b) {
        result = a+ b;
        countLiveData.setValue(result);
    }

}