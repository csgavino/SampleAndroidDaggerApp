package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.myapplication.di.ActivityComponent
import com.example.myapplication.di.DaggerActivityComponent
import com.example.myapplication.di.DaggerTaskComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var taskService: TaskService

    val activityComponent: ActivityComponent by lazy {
        DaggerActivityComponent.builder()
                .applicationComponent(MainApplication.get(this).getComponent())
                .taskComponent(DaggerTaskComponent.create())
                .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityComponent.inject(this)

        val labelTextView = this.findViewById(R.id.labelTextView) as TextView

        val tasks = taskService.getTasks()
        for (task in tasks) {
            labelTextView.text = task
        }
    }
}
