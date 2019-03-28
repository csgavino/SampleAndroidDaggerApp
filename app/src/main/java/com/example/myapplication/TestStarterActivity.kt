package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity

class TestStarterActivity : AppCompatActivity() {
    inline fun <reified T : Activity> start() {
        startActivity(Intent(this, T::class.java))
    }
}
