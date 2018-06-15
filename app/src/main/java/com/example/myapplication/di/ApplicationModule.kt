package com.example.myapplication.di

import android.app.Application
import android.content.Context
import com.example.myapplication.MainApplication
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val app: MainApplication) {

    @Provides
    fun providesContext(): Context {
        return app
    }

    @Provides
    fun providesApp(): Application {
        return app
    }
}
