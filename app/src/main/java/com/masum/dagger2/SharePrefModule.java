package com.masum.dagger2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SharePrefModule {

    private Context context;

    public SharePrefModule(Context context){
        this.context=context;
    }

    @Singleton
    @Provides
    public Context provideContext(){
        return context;
    }


    @Singleton
    @Provides
    public SharedPreferences provideSharedPreferences(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }



}
