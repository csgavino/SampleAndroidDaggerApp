package com.example.myapplication.tasks

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import jp.co.suzuki.thunderjunction.PresenterStubCall
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.verify
import retrofit2.Response

class MainPresenterTest {

    private lateinit var mainView: MainContract.View

    private lateinit var repository: TaskRepository

    private lateinit var subject: MainPresenter

    @Before
    fun setUp() {
        mainView = mock()
        repository = mock()

        subject = MainPresenter(repository)
        subject.takeView(mainView)
    }

    @Test
    fun testGetTasks() {
        val todo = Todo("userId", "id", "title", false)
        val call = PresenterStubCall<Todo>()
        call.response = Response.success(todo)
        whenever(repository.getTasks()).thenReturn(call)


        subject.getTasks("foo@example.com")


        verify(mainView).showTasks("title")
    }
}
