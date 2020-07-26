package com.example.reseptron;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class AdditionModel extends BaseObservable {
    private String first_value;
    private String second_value;


    @Bindable
    public String getFirst_value() {
        return first_value;
    }

    public void setFirst_value(String first_value) {
        this.first_value = first_value;
        notifyPropertyChanged(BR.first_value);
    }
    @Bindable
    public String getSecond_value() {
        return second_value;
    }

    public void setSecond_value(String second_value) {
        this.second_value = second_value;
        notifyPropertyChanged(BR.second_value);
    }
    @Bindable
    public String getResult() {
        return result;
    }

    public AdditionModel() {
    }

    public AdditionModel(String first_value, String second_value) {
        this.first_value = first_value;
        this.second_value = second_value;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    private String result;
}
