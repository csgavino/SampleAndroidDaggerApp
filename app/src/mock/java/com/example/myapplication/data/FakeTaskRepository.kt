package com.example.myapplication.data

import com.example.myapplication.tasks.TaskRepository

class FakeTaskRepository : TaskRepository {

    override fun getTasks(email: String): List<String> {
        return listOf("Espresso")
    }
}
