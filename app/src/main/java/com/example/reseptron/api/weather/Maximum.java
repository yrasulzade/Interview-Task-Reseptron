package com.example.reseptron.api.weather;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.reseptron.BR;
import com.google.android.gms.common.util.Strings;

public class Maximum extends BaseObservable {
    private String UnitType;

    private String Value;

    private String Unit;

    public String getUnitType() {
        return UnitType;
    }

    public void setUnitType(String UnitType) {
        this.UnitType = UnitType;
    }

    @Bindable
    public String getValue() {
        double faranheitValue = Double.parseDouble(Value);
        double celsius = (faranheitValue - 32) * 5 / 9;

        String celsius_result = String.format("%.2f", celsius);


        return celsius_result;
    }


    public void setValue(String Value) {
        this.Value = Value;
        notifyPropertyChanged(BR.value);
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    @Override
    public String toString() {
        return "ClassPojo [UnitType = " + UnitType + ", Value = " + Value + ", Unit = " + Unit + "]";
    }
}