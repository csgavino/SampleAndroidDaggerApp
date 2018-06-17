package com.example.myapplication

interface BasePresenter<T> {

    fun takeView(view: T)

    fun dropView()
}
