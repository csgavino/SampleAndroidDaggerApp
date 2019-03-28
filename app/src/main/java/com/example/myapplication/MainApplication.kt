package com.example.myapplication

import android.app.Activity
import android.app.Application
import com.example.myapplication.tasks.TaskRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface DependencyInjector {
    val taskRepository: TaskRepository
}

class DefaultDependencyInjector : DependencyInjector {
    private val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    override val taskRepository: TaskRepository = retrofit.create(TaskRepository::class.java)
}

class MainApplication : Application() {
    var dependencyInjector: DependencyInjector = DefaultDependencyInjector()
}

val Activity.app: MainApplication
    get() = application as MainApplication

val Activity.dependencyInjector: DependencyInjector
    get() = app.dependencyInjector