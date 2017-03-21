package com.example.user.samplerecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList countries;

    private final String android_version_names[] = {
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow"
    };

    private final String android_image_urls[] = {
            "https://api.learn2crack.com/android/images/donut.png",
            "https://api.learn2crack.com/android/images/eclair.png",
            "https://api.learn2crack.com/android/images/froyo.png",
            "https://api.learn2crack.com/android/images/ginger.png",
            "https://api.learn2crack.com/android/images/honey.png",
            "https://api.learn2crack.com/android/images/icecream.png",
            "https://api.learn2crack.com/android/images/jellybean.png",
            "https://api.learn2crack.com/android/images/kitkat.png",
            "https://api.learn2crack.com/android/images/lollipop.png",
            "https://api.learn2crack.com/android/images/marshmallow.png"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   initviewArray();

       //For loading images from picasa
        initviewpicas();
        
    }

    private void initviewpicas() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList androidVersions = prepareData();
        DataAdapterPic adapterpic = new DataAdapterPic(getApplicationContext(),androidVersions);
        recyclerView.setAdapter(adapterpic);


    }

    private ArrayList prepareData(){

        ArrayList android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }

    private void initviewArray() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        countries = new ArrayList<>();
        countries.add("Australia");
        countries.add("India");
        countries.add("United States of America");
        countries.add("Germany");
        countries.add("Russia");
        RecyclerView.Adapter adapter = new DataAdapter(countries);
        recyclerView.setAdapter(adapter);
    }
}
