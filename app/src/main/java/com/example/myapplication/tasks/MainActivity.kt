package com.example.myapplication.tasks

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


class MainActivity : DaggerAppCompatActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener { _ ->
            presenter.openTaskDetail()
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun showTask(task: String) {
        val textView = findViewById<TextView>(R.id.labelTextView)
        textView.setText(task)
    }
}
