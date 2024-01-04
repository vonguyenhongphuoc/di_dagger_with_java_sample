package com.devhp.di_dagger_java_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

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
        App.getApp().getSmartPhoneComponent().inject(this);
        Log.d("onCreate", "Init OnCreate");
        smartPhone.run();
        Log.d("MyTag", serviceProvider.getProviderInfo());
        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(v -> {
            startActivity(new Intent(this, ContentActivity.class));
        });

//        ServiceProvider serviceProvider = new ServiceProvider();
//        SIMCard simCard = new SIMCard(serviceProvider);
//        MemoryCard memoryCard = new MemoryCard();
//        Battery battery = new Battery();
//        SmartPhone smartPhone = new SmartPhone(simCard, memoryCard, battery);
//        smartPhone.run();


    }

    @Override
    protected void onResume() {
        super.onResume();
        App.getApp().getSmartPhoneComponent().inject(this);
    }
}