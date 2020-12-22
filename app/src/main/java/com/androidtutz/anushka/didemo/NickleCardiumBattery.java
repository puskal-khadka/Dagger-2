package com.androidtutz.anushka.didemo;

import android.util.Log;

import javax.inject.Inject;

public class NickleCardiumBattery implements Battery {


    @Inject
    public NickleCardiumBattery() {
    }

    @Override
    public void showType() {
        Log.d("tag", "nicle cardium battery");

    }
}
