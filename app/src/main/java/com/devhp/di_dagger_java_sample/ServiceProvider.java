package com.devhp.di_dagger_java_sample;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ServiceProvider {

    @Inject
    public ServiceProvider() {
        Log.d("MyTag", "Running Service Provider");
    }

    public String getProviderInfo(){
        return "Intel Core i9";
    }
}
