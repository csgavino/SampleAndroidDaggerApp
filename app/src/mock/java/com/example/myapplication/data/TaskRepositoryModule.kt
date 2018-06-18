package com.example.myapplication.data

import com.example.myapplication.tasks.TaskRepository
import dagger.Module
import dagger.Provides

@Module
class TaskRepositoryModule {

    @Provides
    fun providesTaskRepository(): TaskRepository {
        return FakeTaskRepository()
    }
}
