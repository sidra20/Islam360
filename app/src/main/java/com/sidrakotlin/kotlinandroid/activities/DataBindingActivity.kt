package com.sidrakotlin.kotlinandroid.activities

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sidrakotlin.kotlinandroid.R
import com.sidrakotlin.kotlinandroid.databinding.LayoutDatabindBinding
import com.sidrakotlin.kotlinandroid.model.Student

class DataBindingActivity:AppCompatActivity() {
    private lateinit var binding: LayoutDatabindBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.layout_databind)

        val obj = Student("Maheen", "maheen@gmail.com")
        binding.stud=obj
    }
}