package com.example.reseptron.ui.map;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MapViewModel extends ViewModel {

    private MapRepository mapRepository;

    //instantiate repository class when MapViewModel instance created
    public MapViewModel() {
        mapRepository = new MapRepository();
    }

    public LiveData<List<Coordinate>> getQuakes() {
        //this if statement avoids `mapRepository` be created multiple times.
        // On the first api call it creates object, but in additional calls it returns existing one rather than creating new one
        if (mapRepository == null) {
            mapRepository = new MapRepository();
        }
        return mapRepository.getCoordinates();
    }
}
