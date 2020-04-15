package com.masum.dagger2;

import javax.inject.Inject;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules={AndroidInjectionModule.class,MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {

}
