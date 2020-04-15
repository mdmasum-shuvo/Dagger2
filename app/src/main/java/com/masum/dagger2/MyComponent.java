package com.masum.dagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {BackendServiceModule.class, UserModule.class})
public interface MyComponent {
    BackendService provideBackendService();

    void Inject(DependencyMain mainActivity);
}
