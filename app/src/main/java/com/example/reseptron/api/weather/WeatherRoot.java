package com.example.reseptron.api.weather;

import java.util.List;

public class WeatherRoot {
    private Headline Headline;
    private List<DailyForecasts> DailyForecasts;

    public List<DailyForecasts> getDailyForecasts() {
        return DailyForecasts;
    }

    public Headline getHeadline ()
    {
        return Headline;
    }

    public void setHeadline (Headline Headline)
    {
        this.Headline = Headline;
    }
}
