package com.devhp.di_dagger_java_sample;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class SmartPhone {

    @Inject
    public SmartPhone(SIMCard simCard, MemoryCard memoryCard, Battery battery) {
        Log.d("MyTag", "Running Engines of SmartPhone "
                + "SIM Card: " + simCard.getSIMCardInfo() +
                " Memory Card: " + memoryCard.getMemoryCardInfo() +
                " Battery: " + battery.getBatteryInfo());
    }

    public void run() {
        Log.d("MyTag", "SmartPhone Running");
    }
}
