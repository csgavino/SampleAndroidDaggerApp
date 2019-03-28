package com.example.myapplication.tasks

import retrofit2.Call
import retrofit2.http.GET

interface TaskRepository {
    @GET("todos/1")
    fun getTasks(): Call<Todo>
}
