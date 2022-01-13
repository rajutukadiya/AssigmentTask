package com.app.assigmenttask.ui.home.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.assigmenttask.databinding.ItemRestaurantBinding;
import com.app.assigmenttask.data.response.ResponseRestaurant;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    public ArrayList<ResponseRestaurant.Datum> mList;

    public RestaurantAdapter(ArrayList<ResponseRestaurant.Datum> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public RestaurantAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemRestaurantBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantAdapter.ViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 :
                mList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(ItemRestaurantBinding itemRestaurantBinding) {
            super(itemRestaurantBinding.getRoot());
        }

        public void onBind(int position)
        {/*val row = mList[position]
            viewBinding.item = row
            viewBinding.pos = position
            viewBinding.itemClickListener = clickListener*/


        }
    }
    public interface ItemClickListener {
        void onSeatedClick(ResponseRestaurant.Datum datum,int position);
        void onTableViewClick(ResponseRestaurant.Datum datum, int position);
    }
}