package com.example.reseptron.ui.addition;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import com.example.reseptron.AdditionModel;
import com.example.reseptron.R;
import com.example.reseptron.databinding.FragmentAdditionBinding;

public class AdditionFragment extends Fragment {

    private AdditionViewModel additionViewModel;
    AdditionModel additionModel;

    public static final String LAST_CALCULATION_KEY = "calculation_key";

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FragmentAdditionBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_addition, container, false);

        additionViewModel = new AdditionViewModel();
        additionModel = new AdditionModel();
        binding.setAddition(additionModel);

        binding.setViewmodel(additionViewModel);

        SharedPreferences pref = getContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();



        if (pref.contains(LAST_CALCULATION_KEY)){
            int number = pref.getInt(LAST_CALCULATION_KEY,0);
            binding.resultText.setText("Result " + number);
        }


        LiveData<Integer> count = additionViewModel.countLiveData;
        count.observe((LifecycleOwner) getContext(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.resultText.setText("Result " + integer);
                editor.putInt(LAST_CALCULATION_KEY,integer);
                editor.apply();
            }
        });


        binding.calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    additionViewModel.getResult(Integer.parseInt(additionModel.getFirst_value()), Integer.parseInt(additionModel.getSecond_value()));
                } catch (Exception e) {
                    Toast.makeText(getContext(), getString(R.string.errorToast), Toast.LENGTH_SHORT).show();
                }

            }
        });

        return binding.getRoot();
    }

}