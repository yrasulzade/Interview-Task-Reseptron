package com.example.reseptron.api;

import com.example.reseptron.api.weather.WeatherRoot;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    //API endpoint
//    @GET("v1/daily/5day/27103?apikey=XcJeV05GH04dm2tMZzxruZdIESDnVaB8")
//    @GET("v1/daily/5day/27103?apikey=6LWeWJ5DUCFGH5U5CGUG70nCPouVfd4o")
    @GET("v1/daily/5day/27103?apikey=OxvmMRyuds4y7H3qqA5pxOG6fUFA8ydp")
    Call<WeatherRoot> getWeather();


    //Weather api bir api key ucun 50 request`e icaze verir. Bir gun erzinde request sayi 50 ni kecerse, api islemir
    // ona gore de bura basqa hesablarlarla yaratdigim elave key`ler qoyuram

    //XcJeV05GH04dm2tMZzxruZdIESDnVaB8

    //6LWeWJ5DUCFGH5U5CGUG70nCPouVfd4o


}
