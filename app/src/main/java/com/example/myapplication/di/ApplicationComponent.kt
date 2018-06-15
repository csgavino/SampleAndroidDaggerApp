package com.example.myapplication.di

import com.example.myapplication.MainApplication
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(app: MainApplication)
}
