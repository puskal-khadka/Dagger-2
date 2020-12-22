package com.androidtutz.anushka.didemo;


import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {

//this memeorycardmodule is for getting dependency ie object of
    //memoryCard class which we consider as memorycard is a class of library ex:of retfofit which constructor can not be directly accessible
    private int memorySize;

    public MemoryCardModule(int memorySize) {
        this.memorySize = memorySize;
    }

    @Provides
     MemoryCard provideMemoryCard(){

        Log.d("mytag", "size of memory is "+memorySize);
        return new MemoryCard();
    }
}
