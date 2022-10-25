package com.sidrakotlin.kotlinandroid.activities

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sidrakotlin.kotlinandroid.R
import com.sidrakotlin.kotlinandroid.viewmodels.Counter

class CounterActivity:AppCompatActivity() {

   private lateinit var countText:TextView
   private lateinit var btnAdd:Button
   private lateinit var btnSub:Button
   private lateinit var counterViewModel:Counter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_counter)


        init()
    }
    private fun init() {
        countText = findViewById(R.id.counterText)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub= findViewById(R.id.btnSub)
        btnSub.isEnabled=false
        counterViewModel = ViewModelProvider(this).get(Counter::class.java)

        countText.text = counterViewModel.count.toString()
        btnAdd.setOnClickListener {
            add()
        }
        btnSub.setOnClickListener {
            sub()
        }
    }
    private fun add()
    {
        btnSub.isEnabled=true
        counterViewModel.increment()
        countText.text = counterViewModel.count.toString()
    }
    private fun sub()
    {
        btnSub.isEnabled=true
        counterViewModel.decrement()
        if(counterViewModel.count==0)
        {

            btnSub.isEnabled=false
        }
        countText.text = counterViewModel.count.toString()


    }
}