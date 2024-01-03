package com.devhp.di_dagger_java_sample;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {
    @Provides
    MemoryCard provideMemoryCard(){
        return new MemoryCard();
    }
}
