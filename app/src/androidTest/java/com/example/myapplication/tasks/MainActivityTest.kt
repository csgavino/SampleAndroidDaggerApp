package com.example.myapplication.tasks

import android.support.test.rule.ActivityTestRule
import com.example.myapplication.DependencyInjector
import com.example.myapplication.TestStarterActivity
import com.example.myapplication.app
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import retrofit2.Call
import retrofit2.Response

class FakeTaskRepository : TaskRepository {
    override fun getTasks(): Call<Todo> {
        val call = ActivityStubCall<Todo>()
        call.response = Response.success(Todo("userId", "id", "title", false))
        return call
    }
}


class MainActivityTest {

    class TestDependencyInjector : DependencyInjector {
        override val taskRepository = FakeTaskRepository()
    }

    @get:Rule
    val rule: ActivityTestRule<TestStarterActivity> = ActivityTestRule(TestStarterActivity::class.java)

    @Before
    fun setUp() {
        rule.activity.app.dependencyInjector = TestDependencyInjector()
        rule.activity.start<MainActivity>()
    }

    @Test
    fun tasks() {
        val mainPage = MainPage()

        mainPage.email = "foo@example.com"
        mainPage.submit()

        mainPage.assertSuccess()
    }
}
