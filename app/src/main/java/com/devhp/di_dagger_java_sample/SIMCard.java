package com.devhp.di_dagger_java_sample;

import android.util.Log;

import javax.inject.Inject;

public class SIMCard {

    @Inject
    public SIMCard(ServiceProvider serviceProvider) {
        Log.d("MyTag", "Running SIM Card with: " + serviceProvider.getProviderInfo());
    }

    public String getSIMCardInfo(){
        return "Viettel";
    }
}
