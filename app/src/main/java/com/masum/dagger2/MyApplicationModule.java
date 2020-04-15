package com.masum.dagger2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {

    @ContributesAndroidInjector
   abstract MainActivity mainActivityInjector();
}
