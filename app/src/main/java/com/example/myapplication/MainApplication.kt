package com.example.myapplication

import android.app.Application
import android.content.Context
import com.example.myapplication.di.ApplicationComponent
import com.example.myapplication.di.DaggerApplicationComponent

class MainApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    companion object {
        fun get(context: Context): MainApplication {
            return context.applicationContext as MainApplication
        }
    }

    fun getComponent(): ApplicationComponent {
        return applicationComponent
    }

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.create()
        applicationComponent.inject(this)
    }
}
