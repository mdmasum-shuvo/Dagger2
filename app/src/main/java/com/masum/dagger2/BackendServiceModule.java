package com.masum.dagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BackendServiceModule {

    @Provides
    @Singleton
    BackendService provideBackendService(@Named("serverUrl") String serviceUrl) {
        return new BackendService(serviceUrl);
    }


    @Provides
    @Named("serverUrl")
    String provideServerUrl() {
        return "https://www.vogella.com/";
    }

    @Provides
    @Named("anotherUrl")
    String provideAnotherUrl() {
        return "http://www.google.com";
    }
}
