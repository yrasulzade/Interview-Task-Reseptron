package com.example.reseptron.api.weather;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.reseptron.BR;

public class Day extends BaseObservable {
    private String HasPrecipitation;

    private String IconPhrase;

    private String Icon;

    public String getHasPrecipitation() {
        return HasPrecipitation;
    }

    public void setHasPrecipitation(String HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
    }

    @Bindable
    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String IconPhrase) {
        this.IconPhrase = IconPhrase;
        notifyPropertyChanged(BR.iconPhrase);
    }

    @Bindable
    public String getIcon() {
        return Icon;
    }

    public void setIcon(String Icon) {
        this.Icon = Icon;
        notifyPropertyChanged(BR.icon);
    }
}

