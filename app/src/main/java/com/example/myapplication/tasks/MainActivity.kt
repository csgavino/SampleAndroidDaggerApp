package com.example.myapplication.tasks

import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


class MainActivity : DaggerAppCompatActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.attachView()
    }

    override fun showTask(task: String) {
        val textView = findViewById<TextView>(R.id.labelTextView)
        textView.setText(task)
    }
}
