package com.example.reseptron.ui.home;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reseptron.R;
import com.example.reseptron.api.weather.DailyForecasts;
import com.example.reseptron.databinding.WeatherCardBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

import static com.example.reseptron.ui.home.HomeFragment.TAG;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
    private Context context;
    private List<DailyForecasts> dailyForecastsList;

    public WeatherAdapter(Context context, List<DailyForecasts> dailyForecastsList) {
        this.context = context;
        this.dailyForecastsList = dailyForecastsList;
    }

    @NonNull
    @Override
    public WeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //sets recycler view card layout
        WeatherCardBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(context), R.layout.weather_card, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherAdapter.ViewHolder holder, int position) {
        DailyForecasts dailyForecasts = dailyForecastsList.get(position);
        holder.weatherCardBinding.setForeCast(dailyForecasts); // sets each weather object to layout
        String uri = getUri(dailyForecasts);

        //downlaod image from server
        Picasso.with(context)
                .load(uri)
                .into(holder.weatherCardBinding.weatherIcon);
    }

    @Override
    public int getItemCount() {
        return dailyForecastsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        WeatherCardBinding weatherCardBinding;

        public ViewHolder(@NonNull WeatherCardBinding binding) {
            super(binding.getRoot());
            weatherCardBinding = binding;

        }

    }

    //    http://apidev.accuweather.com/developers/Media/Default/WeatherIcons/01-s.png

    //api her hava seratine uygun olaraq reqem gonderir ve bu sekilin uri-i hemin reqemin onlarin verdiyi image uri-na set olunaraq elde edilir
    // hemin api-da eger sekil ucun nomre 10-dan kicikdirse, hemin reqemin qarsisina `0` elave olunmasini teleb edir
    //buradaki if serti ise onu temin edir
    private String getUri(DailyForecasts dailyForecasts) {
        int icon = Integer.parseInt(dailyForecasts.getDay().getIcon());
        String uri;
        if (icon < 10) {
            uri = "https://apidev.accuweather.com/developers/Media/Default/WeatherIcons/0" + icon + "-s.png";
        } else {
            uri = "https://apidev.accuweather.com/developers/Media/Default/WeatherIcons/" + icon + "-s.png";
        }
        return uri;
    }
}
