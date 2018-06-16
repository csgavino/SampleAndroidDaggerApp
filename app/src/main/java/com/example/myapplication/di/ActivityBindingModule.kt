package com.example.myapplication.di

import com.example.myapplication.tasks.MainActivity
import com.example.myapplication.tasks.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindsMainActivity(): MainActivity

}
