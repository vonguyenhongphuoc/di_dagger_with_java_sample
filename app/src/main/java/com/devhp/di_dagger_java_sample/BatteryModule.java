package com.devhp.di_dagger_java_sample;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {
    @Provides
    Battery provideBattery() {return new BatteryImpl();
    }

//    @Binds
//    abstract Battery bindBattery(BatteryImpl battery);
}
