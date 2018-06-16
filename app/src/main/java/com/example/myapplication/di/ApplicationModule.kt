package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.MainApplication
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindContext(application: MainApplication): Context
}
