package com.example.myapplication.tasks

import javax.inject.Inject


class DefaultMainPresenter @Inject constructor(private val mainView: MainView,
                                               private val taskRepository: TaskRepository) : MainPresenter {

    override fun attachView() {
        val tasks = taskRepository.getTasks()
        mainView.showTask(tasks[0])
    }
}
