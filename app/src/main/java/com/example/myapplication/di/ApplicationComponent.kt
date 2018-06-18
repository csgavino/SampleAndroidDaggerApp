package com.example.myapplication.di

import com.example.myapplication.MainApplication
import com.example.myapplication.data.TaskRepositoryModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = arrayOf(
        TaskRepositoryModule::class,
        AndroidSupportInjectionModule::class,
        ApplicationModule::class,
        ActivityBindingModule::class))
interface ApplicationComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MainApplication>()
}
