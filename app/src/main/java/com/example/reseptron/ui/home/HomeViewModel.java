package com.example.reseptron.ui.home;

import androidx.lifecycle.MutableLiveData;

import com.example.reseptron.api.weather.WeatherRoot;

public class HomeViewModel extends HomeRepository {

    MutableLiveData<WeatherRoot> mutableLiveData;
    HomeRepository homeRepository;
    //instantiate repository class when HomeViewModel instance created
    public HomeViewModel() {
        homeRepository = new HomeRepository();
    }

    public MutableLiveData<WeatherRoot> getWeather() {
        //this if statement avoids `homeRepository` be created multiple times.
        // On the first api call it creates object, but in additional calls it returns existing one rather than creating new one

        if (mutableLiveData == null) {
            mutableLiveData = homeRepository.getWeather();
        }
        return mutableLiveData;
    }
}
