package com.example.myapplication.tasks

import javax.inject.Inject

class MainPresenter @Inject constructor(private val mainView: MainContract.View,
                                        private val taskRepository: TaskRepository) : MainContract.Presenter {

    override fun takeView(view: MainContract.View) {
        // noop
    }

    override fun getTasks(email: String) {
        mainView.showTasks(taskRepository.getTasks(email).joinToString(", "))
    }
}
