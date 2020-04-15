package com.masum.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    @Singleton
    User provideUser(){
        return new User("Masum","Talukder");
    }
}
