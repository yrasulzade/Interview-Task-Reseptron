package com.example.reseptron.ui.map;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;

import com.example.reseptron.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    //triggered when map is ready to use
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //calls data of Metro Coodinates from viewmodel which triggers repository
        MapViewModel mapViewModel= new MapViewModel();
        mapViewModel.getQuakes().observe(this, new Observer<List<Coordinate>>() {
            @Override
            public void onChanged(List<Coordinate> coordinates) {

                // loop through each metro and add marker
                for (int i = 0; i < coordinates.size(); i++) {
                    addMarker(coordinates.get(i));
                }
            }
        });

    }

    //setting markers to certain latitude & longtitude
    public void addMarker(Coordinate coordinate) {

        LatLng latLng = new LatLng(coordinate.getLatitude(), coordinate.getLongitude());
        mMap.addMarker(new MarkerOptions().position(latLng).title(coordinate.getPlaceTitle()));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 12.0f));

    }
}