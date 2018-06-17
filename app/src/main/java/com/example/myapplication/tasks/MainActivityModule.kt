package com.example.myapplication.tasks

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    fun providesMainView(mainActivity: MainActivity): MainContract.View {
        return mainActivity
    }

    @Provides
    fun providesMainPresenter(mainView: MainContract.View, taskRepository: TaskRepository): MainContract.Presenter {
        return MainPresenter(mainView, taskRepository)
    }

    @Provides
    fun providesTaskRepository(): TaskRepository {
        return DefaultTaskRepository()
    }
}
