package com.example.mvvmrestapijava;

import android.app.Application;

import com.example.mvvmrestapijava.dagger.components.AppComponent;

public class BaseApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
