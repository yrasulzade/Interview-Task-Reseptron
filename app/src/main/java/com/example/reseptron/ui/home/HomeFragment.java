package com.example.reseptron.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reseptron.R;
import com.example.reseptron.api.weather.WeatherRoot;
import com.example.reseptron.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    public static final String TAG = "geek";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //sets data biniding for view
        FragmentHomeBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_home, container, false
        );

        View root = binding.getRoot();

        HomeViewModel homeViewModel = new HomeViewModel();

//        calls weather data from viewmodel which triggers repository
        homeViewModel.getWeather().observe((LifecycleOwner) getContext(), new Observer<WeatherRoot>() {
            @Override
            public void onChanged(WeatherRoot weatherRoot) {
                WeatherAdapter adapter = new WeatherAdapter(getContext(), weatherRoot.getDailyForecasts());
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
                binding.recyclerView.setHasFixedSize(true);
                binding.recyclerView.setLayoutManager(layoutManager);
                binding.recyclerView.setAdapter(adapter);
                binding.setWeather(weatherRoot.getDailyForecasts().get(0));
                binding.setIsDataFetched(true);
            }
        });

        return root;
    }
}