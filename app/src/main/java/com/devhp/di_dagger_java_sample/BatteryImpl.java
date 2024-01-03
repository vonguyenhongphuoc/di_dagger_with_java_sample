package com.devhp.di_dagger_java_sample;

import javax.inject.Inject;

public class BatteryImpl implements Battery {

    public BatteryImpl() {
    }

    @Override
    public String getBatteryInfo() {
        return "Power by 999";
    }
}
