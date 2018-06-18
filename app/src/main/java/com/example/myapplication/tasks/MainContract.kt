package com.example.myapplication.tasks

import com.example.myapplication.BaseView

interface MainContract {

    interface Presenter {

        fun takeView(view: MainContract.View)

        fun getTasks(email: String)
    }

    interface View : BaseView<Presenter> {

        fun showTasks(task: String)
    }
}
