package com.androidtutz.anushka.didemo;

import android.app.Application;

public class App extends Application {

    private static App app;

    private SmartPhoneComponent smartPhoneComponent;


    private static SmartPhoneComponent mySmartPhoneComponent;

    public static App getApp() {
        return app;
    }

    public SmartPhoneComponent getSmartPhoneComponent() {
        return smartPhoneComponent;
    }


    public static SmartPhoneComponent getMySmartPhoneComponent() {
        return  mySmartPhoneComponent;
    }



    @Override
    public void onCreate() {
        super.onCreate();

        app=this;



        //use this module not have constructor or state
//       SmartPhoneComponent smartPhoneComponent=DaggerSmartPhoneComponent.create();

        //use this if at least one module have state
         smartPhoneComponent=DaggerSmartPhoneComponent.builder()
                .memoryCardModule(new MemoryCardModule(15))    //here 15 is value pass to constructor of memoryCardModule
                .build();



         // my way
        mySmartPhoneComponent=smartPhoneComponent;






    }
}
