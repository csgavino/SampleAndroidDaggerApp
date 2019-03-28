package com.example.myapplication.tasks

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import com.example.myapplication.R

class MainPage {

    var email: String
        get() = this.toString()
        set(email) {
            onView(ViewMatchers.withId(R.id.edit_text_email))
                    .perform(ViewActions.typeText(email))
        }

    fun submit(): ViewInteraction =
            onView(ViewMatchers.withId(R.id.btn_submit))
                    .perform(ViewActions.click())

    fun assertSuccess(): ViewInteraction =
            onView(ViewMatchers.withId(R.id.text_view_tasks))
                    .check(ViewAssertions.matches(ViewMatchers.withText("title")))
}
