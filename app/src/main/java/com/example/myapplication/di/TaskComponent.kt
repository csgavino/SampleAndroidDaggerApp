package com.example.myapplication.di

import com.example.myapplication.TaskService
import dagger.Component

@Component(modules = arrayOf(TaskModule::class))
interface TaskComponent {

    fun taskService(): TaskService
}
