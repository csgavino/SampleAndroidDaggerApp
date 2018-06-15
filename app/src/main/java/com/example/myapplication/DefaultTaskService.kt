package com.example.myapplication

class DefaultTaskService(private val taskRepository: TaskRepository) : TaskService {

    override fun getTasks(): List<String> {
        return taskRepository.getTasks()
    }
}
