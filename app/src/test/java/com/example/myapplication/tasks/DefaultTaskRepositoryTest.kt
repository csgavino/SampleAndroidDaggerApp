package com.example.myapplication.tasks

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class DefaultTaskRepositoryTest {

    lateinit var subject: DefaultTaskRepository

    @Before
    fun setUp() {
        subject = DefaultTaskRepository()
    }

    @Test
    fun testGetTasks() {
        val tasks = subject.getTasks("foo@example.com")
        assertThat(tasks[0]).isEqualTo("Espresso")
    }
}
