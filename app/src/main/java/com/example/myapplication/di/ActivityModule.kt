package com.example.myapplication.di

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providesContext(): Context {
        return activity
    }

    @Provides
    fun providesActivity(): Activity {
        return activity
    }
}
