package com.example.myapplication.tasks

import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun tasks() {
        val mainPage = MainPage()

        mainPage.email = "foo@example.com"
        mainPage.submit()

        mainPage.assertSuccess()
    }
}
