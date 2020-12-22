package com.androidtutz.anushka.didemo;


import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {MemoryCardModule.class, BatteryModule.class})
public interface SmartPhoneComponent {

//    SmartPhone getSmartPhone();


    //this is another way best way then above return
    void inject(MainActivity mainActivity);

}
