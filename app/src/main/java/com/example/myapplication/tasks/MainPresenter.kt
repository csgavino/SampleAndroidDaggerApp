package com.example.myapplication.tasks

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter constructor(private val taskRepository: TaskRepository) : MainContract.Presenter {

    lateinit var mainView: MainContract.View

    override fun takeView(view: MainContract.View) {
        mainView = view
    }

    override fun getTasks(email: String) {
        taskRepository.getTasks()
                .enqueue(object : Callback<Todo> {
                    override fun onFailure(call: Call<Todo>, t: Throwable) {
                        // noop
                    }

                    override fun onResponse(call: Call<Todo>, response: Response<Todo>) {
                        if (response.isSuccessful) {
                            mainView.showTasks(response.body()!!.title)
                        }
                    }
                })
    }
}
