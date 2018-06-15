package com.example.myapplication.di

import com.example.myapplication.DefaultTaskRepository
import com.example.myapplication.DefaultTaskService
import com.example.myapplication.TaskRepository
import com.example.myapplication.TaskService
import dagger.Module
import dagger.Provides

@Module
class TaskModule {

    @Provides
    fun providesTaskService(taskRepository: TaskRepository): TaskService {
        return DefaultTaskService(taskRepository)
    }

    @Provides
    fun providesTaskRepository(): TaskRepository {
        return DefaultTaskRepository()
    }
}
