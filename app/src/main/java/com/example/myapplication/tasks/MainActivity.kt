package com.example.myapplication.tasks

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.dependencyInjector

class MainActivity : AppCompatActivity(), MainContract.View {

    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(dependencyInjector.taskRepository)
        presenter.takeView(this)

        val email = findViewById<EditText>(R.id.edit_text_email)

        val button = findViewById<Button>(R.id.btn_submit)
        button.setOnClickListener { _ ->
            presenter.getTasks(email.text.toString())
        }
    }

    override fun onResume() {
        super.onResume()
        presenter.takeView(this)
    }

    override fun showTasks(task: String) {
        val textView = findViewById<TextView>(R.id.text_view_tasks)
        textView.text = task
    }
}
