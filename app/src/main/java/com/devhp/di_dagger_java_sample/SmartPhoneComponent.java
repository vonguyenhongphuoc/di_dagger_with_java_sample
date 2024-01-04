package com.devhp.di_dagger_java_sample;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {MemoryCardModule.class, BatteryModule.class})
public interface SmartPhoneComponent {
   void inject(MainActivity mainActivity);

   void inject(ServiceProvider serviceProvider);
}
