package com.example.myapplication.tasks

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import com.example.myapplication.R
import org.junit.Rule
import org.junit.Test


class MainActivityTest {

    @get:Rule
    val rule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun tasks() {
        onView(withId(R.id.edit_text_email)).perform(typeText("foo@example.com"))
        onView(withId(R.id.btn_submit)).perform(click())
        onView(withId(R.id.text_view_tasks)).check(matches(withText("Espresso")))
    }
}
