package com.example.assignment8navigationdrawerui.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment8navigationdrawerui.Adapter.TravelingAdapter;
import com.example.assignment8navigationdrawerui.Model.TravelingModel;
import com.example.assignment8navigationdrawerui.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = root.findViewById(R.id.rv);
//        Toast.makeText(getActivity(), "aaaaa", Toast.LENGTH_SHORT).show();

        homeViewModel.getlist().observe(getViewLifecycleOwner(), new Observer<ArrayList<TravelingModel>>() {
            @Override
            public void onChanged(ArrayList<TravelingModel> travelingModels) {

                recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false));
//                recyclerView.setNestedScrollingEnabled(true);
                TravelingAdapter travelingAdapter= new TravelingAdapter(getActivity(), travelingModels);
                recyclerView.setAdapter(travelingAdapter);
            }
        });

        return root;
    }
}