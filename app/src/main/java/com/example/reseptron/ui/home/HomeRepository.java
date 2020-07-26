package com.example.reseptron.ui.home;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.reseptron.api.ApiService;
import com.example.reseptron.api.RetrofitInstance;
import com.example.reseptron.api.weather.WeatherRoot;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.reseptron.ui.home.HomeFragment.TAG;

public class HomeRepository {

    public MutableLiveData<WeatherRoot> getWeather(){
        // live data instance which will go to HomeFragment through HomeViewModel
        MutableLiveData<WeatherRoot> liveData = new MutableLiveData<>();

        ApiService apiService = RetrofitInstance.getRetrofitInstance().create(ApiService.class);
        Call<WeatherRoot> call = apiService.getWeather();

        call.enqueue(new Callback<WeatherRoot>() {
            @Override
            public void onResponse(Call<WeatherRoot> call, Response<WeatherRoot> response) {

                try {
                    //set values to liveData object when api call finishes
                    liveData.postValue(response.body());
                }
                catch (Exception e){
                    Log.d(TAG, "onResponse: " +  e);
                }
            }

            @Override
            public void onFailure(Call<WeatherRoot> call, Throwable t)  {
                Log.d(TAG, "onFailure: " +  t);
            }
        });
        return liveData;
    }
}
