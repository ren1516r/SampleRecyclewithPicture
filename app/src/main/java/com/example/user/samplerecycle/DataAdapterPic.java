package com.example.user.samplerecycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.ArrayList;

/**
 * Created by user on 3/17/2017.
 */

public class DataAdapterPic extends RecyclerView.Adapter<DataAdapterPic.viewimage> {
    private ArrayList<AndroidVersion> android_versions;
    private Context context;

    public DataAdapterPic(Context context, ArrayList<AndroidVersion> android_versions) {
        this.context = context;
        this.android_versions = android_versions;
    }

        @Override
    public viewimage onCreateViewHolder(ViewGroup parent, int viewType) {
 View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.image,parent,false);
            return new viewimage(view);
    }



    @Override
    public void onBindViewHolder(viewimage holder, int position) {

        Log.d("image",android_versions.get(position).getAndroid_image_url());
        holder.tv_android.setText(android_versions.get(position).getAndroid_version_name());
        Picasso.with(context).load(android_versions.get(position).getAndroid_image_url()).resize(240,120).into(holder.img_android);
    }

    @Override
    public int getItemCount() {
        return android_versions.size();
    }
public class viewimage extends RecyclerView.ViewHolder{
    TextView tv_android;
    ImageView img_android;
    public viewimage(View itemView) {
        super(itemView);
        tv_android = (TextView)itemView.findViewById(R.id.tv_android);
        img_android = (ImageView)itemView.findViewById(R.id.img_android);

    }
}

}

