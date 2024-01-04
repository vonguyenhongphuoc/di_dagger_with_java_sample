package com.devhp.di_dagger_java_sample;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {
    private final int memorySize;
    private static final String TAG = "MyTag";

    public MemoryCardModule(int memorySize) {
        this.memorySize = memorySize;
    }

    @Provides
    MemoryCard provideMemoryCard(){
        Log.d(TAG, "Size of the memory card is: " + memorySize);
        return new MemoryCard();
    }
}
