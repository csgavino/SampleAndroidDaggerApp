package com.example.myapplication.tasks

interface TaskRepository {

    fun getTasks(email: String): List<String>
}
