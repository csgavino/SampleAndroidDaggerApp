package com.example.myapplication

class DefaultTaskRepository : TaskRepository {

    override fun getTasks(): List<String> {
        return listOf("Study Japanese")
    }
}