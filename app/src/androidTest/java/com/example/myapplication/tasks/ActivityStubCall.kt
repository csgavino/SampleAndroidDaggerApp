package com.example.myapplication.tasks

import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ActivityStubCall<T> : Call<T> {
    var response: Response<T>? = null

    override fun enqueue(callback: Callback<T>) {
        response?.let {
            callback.onResponse(this, it)
        }
    }

    override fun isExecuted(): Boolean {
        return true
    }

    override fun clone(): Call<T> {
        return this
    }

    override fun isCanceled(): Boolean {
        return false
    }

    override fun cancel() {
    }

    override fun execute(): Response<T> {
        return response!!
    }

    override fun request(): Request {
        return Request.Builder().build()
    }
}
