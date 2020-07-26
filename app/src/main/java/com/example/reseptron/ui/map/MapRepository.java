package com.example.reseptron.ui.map;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class MapRepository {

    public MutableLiveData<List<Coordinate>> getCoordinates() {

        MutableLiveData<List<Coordinate>> mutableLiveData = new MutableLiveData<>();

        List<Coordinate> coordinates = new ArrayList<>();

        //add all metro station LatLng to to list and then set to MutableLiveData which goes to MapViewModel

        Coordinate coordinate = new Coordinate(40.3995538, 49.8031478, "20 Yanvar st.");
        Coordinate coordinate1 = new Coordinate(40.3664054, 49.8313521, "Icherisheher");
        Coordinate coordinate2 = new Coordinate(40.3804398, 49.8500525, "28 May st.");
        Coordinate coordinate3 = new Coordinate(40.4004909, 49.849354, "Genclik st.");
        Coordinate coordinate4 = new Coordinate(40.4020559, 49.8692405, "Nariman Narimanov st.");
        Coordinate coordinate6 = new Coordinate(40.417776, 49.9299073, "Gara Garayev st.");
        Coordinate coordinate7 = new Coordinate(40.396881, 49.9502473, "Xalqlar dostlugu st.");
        Coordinate coordinate8 = new Coordinate(40.3845419, 49.9530142, "Ehmedli st.");
        Coordinate coordinate9 = new Coordinate(40.3744068, 49.9516284, "Hezi Aslanov st.");
        Coordinate coordinate10 = new Coordinate(40.383086, 49.8697653, "Xətai st.");
        Coordinate coordinate11 = new Coordinate(40.3804202, 49.8482931, "Jafar jabbarli st.");
        Coordinate coordinate12 = new Coordinate(40.3780422, 49.8250179, "Nizami st.");
        Coordinate coordinate13 = new Coordinate(40.3749677, 49.8121951, "Elmler Akademiyasi st.");
        Coordinate coordinate14 = new Coordinate(40.4241463, 49.824901, "Nasimi st.");
        Coordinate coordinate16 = new Coordinate(40.425229, 49.8396394, "Azadliq st.");
        Coordinate coordinate17 = new Coordinate(40.4252071, 49.8625375, "Darnagul st.");
        Coordinate coordinate18 = new Coordinate(40.4105757, 49.937867, "Neftçilər st.");
        Coordinate coordinate19 = new Coordinate(40.3716176, 49.8437788, "Sahil st.");
        Coordinate coordinate20 = new Coordinate(40.407205,49.8049102, "Memar Ajami st.");
        Coordinate coordinate21 = new Coordinate(40.4206854,49.9054694, "Koroglu st.");
        Coordinate coordinate22 = new Coordinate(40.41409,49.8770734, "Bakmil st.");
        Coordinate coordinate23 = new Coordinate(40.391427,49.8005983, "Insahaatchilar st.");


        coordinates.add(coordinate);
        coordinates.add(coordinate1);
        coordinates.add(coordinate2);
        coordinates.add(coordinate3);
        coordinates.add(coordinate4);
        coordinates.add(coordinate6);
        coordinates.add(coordinate7);
        coordinates.add(coordinate8);
        coordinates.add(coordinate9);
        coordinates.add(coordinate10);
        coordinates.add(coordinate11);
        coordinates.add(coordinate12);
        coordinates.add(coordinate13);
        coordinates.add(coordinate14);
        coordinates.add(coordinate16);
        coordinates.add(coordinate17);
        coordinates.add(coordinate18);
        coordinates.add(coordinate19);
        coordinates.add(coordinate20);
        coordinates.add(coordinate21);
        coordinates.add(coordinate22);
        coordinates.add(coordinate23);

        mutableLiveData.postValue(coordinates);  // set to mutable live data

        return mutableLiveData;

    }


}