package com.example.myapplication.tasks

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.verify

class MainPresenterTest {

    private lateinit var mainView: MainContract.View

    private lateinit var repository: TaskRepository

    private lateinit var subject: MainPresenter

    @Before
    fun setUp() {
        mainView = mock()
        repository = mock()

        subject = MainPresenter(mainView, repository)
    }

    @Test
    fun testGetTasks() {
        val tasks = listOf("I am a task")
        whenever(repository.getTasks(ArgumentMatchers.anyString())).thenReturn(tasks)

        subject.getTasks("foo@example.com")

        verify(mainView).showTasks("I am a task")
    }
}
