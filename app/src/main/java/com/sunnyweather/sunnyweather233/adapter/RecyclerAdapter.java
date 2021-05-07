package com.sunnyweather.sunnyweather233.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.sunnyweather.sunnyweather233.MainActivity;
import com.sunnyweather.sunnyweather233.R;
import com.sunnyweather.sunnyweather233.activity.WeatherDetails;
import com.sunnyweather.sunnyweather233.bean.AdressBean;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<AdressBean.PlacesBean> placeList;

    private Context mContext;


    public RecyclerAdapter(List<AdressBean.PlacesBean> list){
        placeList = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final AdressBean.PlacesBean place = placeList.get(position);
        holder.name.setText(place.getName());
        holder.adress.setText(place.getFormatted_address());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(MainActivity.sp.getInt("FirstInto",0) == 0){
                    MainActivity.sp.edit().putInt("FirstInto",1).apply();
                    Intent intent = new Intent(mContext, WeatherDetails.class);
                    intent.putExtra("name",place.getName());
                    intent.putExtra("lng,lat",place.getLocation().getLng()+","+place.getLocation().getLat());
                    mContext.startActivity(intent);
                    ((MainActivity)mContext).finish();
                }else{
                    WeatherDetails.flag = 1;
                    WeatherDetails.drawLayout.closeDrawers();
                    WeatherDetails.swip.setRefreshing(true);
                    Intent intent = new Intent(mContext, WeatherDetails.class);
                    intent.putExtra("name",place.getName());
                    intent.putExtra("lng,lat",place.getLocation().getLng()+","+place.getLocation().getLat());
                    mContext.startActivity(intent);
                    ((WeatherDetails)mContext).finish();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView name;
        TextView adress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
            name = (TextView) itemView.findViewById(R.id.name);
            adress = (TextView) itemView.findViewById(R.id.adress);
        }
    }
}
