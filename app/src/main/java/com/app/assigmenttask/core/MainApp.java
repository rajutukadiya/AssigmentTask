package com.app.assigmenttask.core;

import static com.app.assigmenttask.di.ModulesKt.apiModule;
import static com.app.assigmenttask.di.ModulesKt.databaseModule;
import static com.app.assigmenttask.di.ModulesKt.networkModule;
import static com.app.assigmenttask.di.ModulesKt.repositoryModule;
import static com.app.assigmenttask.di.ModulesKt.viewModelModule;
import static org.koin.core.context.DefaultContextExtKt.startKoin;

import android.content.res.Configuration;

import androidx.annotation.NonNull;
import androidx.multidex.MultiDexApplication;

import org.koin.android.java.KoinAndroidApplication;
import org.koin.core.KoinApplication;

public class MainApp extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        KoinApplication koin = KoinAndroidApplication.create(this)
                .modules(apiModule,databaseModule,repositoryModule,viewModelModule,networkModule);
        startKoin(koin);
    }
}
