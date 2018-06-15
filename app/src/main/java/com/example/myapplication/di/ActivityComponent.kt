package com.example.myapplication.di

import com.example.myapplication.MainActivity
import dagger.Component

@Component(dependencies = arrayOf(ApplicationComponent::class, TaskComponent::class),
        modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activity: MainActivity)
}
