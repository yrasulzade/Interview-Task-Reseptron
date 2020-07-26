package com.example.reseptron.ui.map;

public class Coordinate {
    private double latitude;
    private double longitude;
    private String placeTitle;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public Coordinate(double latitude, double longitude, String placeTitle) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.placeTitle = placeTitle;
    }

}
