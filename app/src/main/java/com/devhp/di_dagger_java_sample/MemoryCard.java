package com.devhp.di_dagger_java_sample;

import android.util.Log;

import javax.inject.Inject;

public class MemoryCard {

    public MemoryCard() {
        Log.d("MyTag", "Running Memory Card");
    }

    public String getMemoryCardInfo(){
        return "SSD SamSung";
    }
}
