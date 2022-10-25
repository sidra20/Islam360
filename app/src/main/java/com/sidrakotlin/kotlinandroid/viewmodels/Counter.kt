package com.sidrakotlin.kotlinandroid.viewmodels

import android.widget.Toast
import androidx.lifecycle.ViewModel

class Counter: ViewModel() {

     var count:Int = 0

    fun increment()
    {
        count++
    }
    fun decrement()
    {
        count--

    }
}