package com.example.myapplication.tasks

import javax.inject.Inject

class MainPresenter @Inject constructor(private val mainView: MainContract.View,
                                        private val taskRepository: TaskRepository) : MainContract.Presenter {

    override fun takeView(view: MainContract.View) {
        val tasks = taskRepository.getTasks()
        mainView.showTask(tasks[0])
    }

    override fun openTaskDetail() {
        mainView.showTask("open task detail")
    }

}
