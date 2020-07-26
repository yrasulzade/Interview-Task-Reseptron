package com.example.reseptron.api.weather;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.reseptron.BR;

import java.util.List;

public class DailyForecasts extends BaseObservable {
    private Temperature Temperature;

    private Night Night;

    private String EpochDate;

    private Day Day;

    private List<String> Sources;

    private String Date;

    private String Link;

    private String MobileLink;

    public void setSources(List<String> sources) {
        Sources = sources;
    }

    @Bindable
    public Temperature getTemperature() {

        return Temperature;
    }

    public void setTemperature(Temperature Temperature) {
        this.Temperature = Temperature;
        notifyPropertyChanged(BR.temperature);
    }

    public Night getNight() {
        return Night;
    }

    public void setNight(Night Night) {
        this.Night = Night;
    }

    public String getEpochDate() {
        return EpochDate;
    }

    public void setEpochDate(String EpochDate) {
        this.EpochDate = EpochDate;
    }

    @Bindable
    public Day getDay() {
        return Day;
    }

    public void setDay(Day Day) {
        this.Day = Day;
        notifyPropertyChanged(BR.day);
    }

    public List<String> getSources() {
        return Sources;
    }

    @Bindable
    public String getDate() {
        String splitDate = Date.split("T")[0];
        return splitDate.split("-")[1] + "/" + splitDate.split("-")[2];
    }

    public void setDate(String Date) {
        this.Date = Date;
        notifyPropertyChanged(BR.date);
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }

}
