package com.androidtutz.anushka.didemo;


import dagger.Module;
import dagger.Provides;

@Module

public class BatteryModule {


    @Provides
    Battery provideNcBattery(NickleCardiumBattery nickleCardiumBattery) {

//        return new NickleCardiumBattery();  it can also use but we craete depencency in niclecardium class so can use in this function parameter

        return nickleCardiumBattery;
    }

}
