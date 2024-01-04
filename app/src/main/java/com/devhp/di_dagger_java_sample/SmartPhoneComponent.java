package com.devhp.di_dagger_java_sample;

import dagger.Component;

@Component(modules = {MemoryCardModule.class, BatteryModule.class})
public interface SmartPhoneComponent {
   void inject(MainActivity mainActivity);

   void inject(ServiceProvider serviceProvider);
}
