package com.devhp.di_dagger_java_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SmartPhone smartPhone;

    @Inject
    ServiceProvider serviceProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate", "Init OnCreate");
        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.builder().memoryCardModule(new MemoryCardModule( 9999)).build();
        smartPhoneComponent.inject(this);
        smartPhone.run();


        Log.d("MyTag", serviceProvider.getProviderInfo());
//        ServiceProvider serviceProvider = new ServiceProvider();
//        SIMCard simCard = new SIMCard(serviceProvider);
//        MemoryCard memoryCard = new MemoryCard();
//        Battery battery = new Battery();
//        SmartPhone smartPhone = new SmartPhone(simCard, memoryCard, battery);
//        smartPhone.run();


    }
}