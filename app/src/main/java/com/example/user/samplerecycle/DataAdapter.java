package com.example.user.samplerecycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.security.acl.LastOwnerException;
import java.util.ArrayList;

/**
 * Created by user on 3/17/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewSample>{
    private ArrayList<String> countries;

    public DataAdapter(ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public ViewSample onCreateViewHolder(ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new ViewSample(view);
    }

    @Override
    public void onBindViewHolder(ViewSample holder, int position) {
        holder.tv_country.setText(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewSample extends RecyclerView.ViewHolder {
        private TextView tv_country;
        public ViewSample(View itemView) {
            super(itemView);
            tv_country = (TextView)itemView.findViewById(R.id.tv_country);
        }
    }



}
