package com.example.myapplication.tasks

class DefaultTaskRepository : TaskRepository {

    override fun getTasks(email: String): List<String> {
        return listOf("Espresso", "Dagger 2", "Retrofit")
    }
}
