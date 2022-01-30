package com.example.mvvmrestapijava.dagger.components;



import com.example.mvvmrestapijava.dagger.modules.ApiModules;
import com.example.mvvmrestapijava.dagger.modules.ContextModules;
import com.example.mvvmrestapijava.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModules.class, ContextModules.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
