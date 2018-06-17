package com.example.myapplication.tasks

import com.example.myapplication.BaseView

interface MainContract {

    interface Presenter {

        fun takeView(view: MainContract.View)

        fun openTaskDetail()
    }

    interface View : BaseView<Presenter> {

        fun showTask(task: String)
    }
}
