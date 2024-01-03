package com.devhp.di_dagger_java_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate", "Init OnCreate");
        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        smartPhone = smartPhoneComponent.getSmartPhone();
        smartPhone.run();

//        ServiceProvider serviceProvider = new ServiceProvider();
//        SIMCard simCard = new SIMCard(serviceProvider);
//        MemoryCard memoryCard = new MemoryCard();
//        Battery battery = new Battery();
//        SmartPhone smartPhone = new SmartPhone(simCard, memoryCard, battery);
//        smartPhone.run();


    }
}