package com.example.assignment8navigationdrawerui.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment8navigationdrawerui.Model.TravelingModel;
import com.example.assignment8navigationdrawerui.R;

import java.util.ArrayList;

public class TravelingAdapter extends RecyclerView.Adapter<TravelingAdapter.ViewHolder> {

    Activity context;
    ArrayList<TravelingModel> data;

    public TravelingAdapter(Activity context, ArrayList<TravelingModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View root = LayoutInflater.from(context).inflate(R.layout.item_gred_recycler_view, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        TravelingModel travelingModel = data.get(position);

        holder.img.setImageResource(travelingModel.getImg());
        holder.type.setText(travelingModel.getType());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView type;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imagType);
            type = itemView.findViewById(R.id.typeTV);
        }
    }
}
