package com.example.reseptron.api.weather;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.reseptron.BR;

public class Temperature extends BaseObservable
{
    private com.example.reseptron.api.weather.Minimum Minimum;
    private Maximum Maximum;

    @Bindable
    public Minimum getMinimum ()
    {
        return Minimum;
    }

    public void setMinimum (Minimum Minimum)
    {
        this.Minimum = Minimum;
        notifyPropertyChanged(BR.minimum);
    }

    @Bindable
    public Maximum getMaximum ()
    {
        return Maximum;
    }

    public void setMaximum (Maximum Maximum)
    {
        this.Maximum = Maximum;
        notifyPropertyChanged(BR.maximum);
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Minimum = "+Minimum+", Maximum = "+Maximum+"]";
    }
}
