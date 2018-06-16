package com.example.myapplication.tasks

interface TaskRepository {

    fun getTasks(): List<String>
}
