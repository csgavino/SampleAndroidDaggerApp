package com.example.myapplication.tasks

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun providesMainView(mainActivity: MainActivity): MainView {
        return mainActivity
    }

    @Provides
    fun providesMainPresenter(mainView: MainView, taskRepository: TaskRepository): MainPresenter {
        return DefaultMainPresenter(mainView, taskRepository)
    }

    @Provides
    fun providesTaskRepository(): TaskRepository {
        return DefaultTaskRepository()
    }
}
