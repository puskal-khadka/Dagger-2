package com.androidtutz.anushka.didemo;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class SmartPhone {


    private String time;

    private Battery battery;

    private MemoryCard memoryCard;
    private SIMCard simCard;
    private static final String TAG = "SmartPhone";



    @Inject
    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;

        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        time = sdf.format(Calendar.getInstance().getTime());

    }


    public void makeACall(){
        Log.d(TAG, " making a call......... ");

            Log.d(TAG, " making call time "+time );
    }


}
