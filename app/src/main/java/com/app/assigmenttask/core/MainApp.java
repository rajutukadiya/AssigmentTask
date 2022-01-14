package com.app.assigmenttask.core;

import androidx.multidex.MultiDexApplication;

import com.app.assigmenttask.di.ModulesKt;

public class MainApp extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ModulesKt.startKoinApp(this);
    }
}
