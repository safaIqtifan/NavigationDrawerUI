package com.example.assignment8navigationdrawerui.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.assignment8navigationdrawerui.Model.TravelingModel;
import com.example.assignment8navigationdrawerui.R;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<ArrayList<TravelingModel>> mutableLiveData;

    public HomeViewModel() {

        mutableLiveData = new MutableLiveData<>();

        ArrayList<TravelingModel> data = new ArrayList<>();
        data.add(new TravelingModel( R.drawable.walking,"Walking"));
        data.add(new TravelingModel( R.drawable.boating, "Boating"));
        data.add(new TravelingModel( R.drawable.bus, "Bus"));
        data.add(new TravelingModel( R.drawable.train, "Train"));
        data.add(new TravelingModel( R.drawable.cycling, "Cycling"));
        data.add(new TravelingModel( R.drawable.plane, "Plane"));

        data.add(new TravelingModel( R.drawable.walking,"Walking"));
        data.add(new TravelingModel( R.drawable.boating, "Boating"));
        data.add(new TravelingModel( R.drawable.bus, "Bus"));
        data.add(new TravelingModel( R.drawable.train, "Train"));
        data.add(new TravelingModel( R.drawable.cycling, "Cycling"));
        data.add(new TravelingModel( R.drawable.plane, "Plane"));

        mutableLiveData.setValue(data);

    }

    public LiveData<ArrayList<TravelingModel>> getlist() {
        return mutableLiveData;
    }
}