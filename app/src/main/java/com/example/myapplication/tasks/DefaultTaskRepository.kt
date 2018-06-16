package com.example.myapplication.tasks

class DefaultTaskRepository : TaskRepository {

    override fun getTasks(): List<String> {
        return listOf("Study Dagger 2")
    }
}
