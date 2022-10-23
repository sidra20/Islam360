package com.sidrakotlin.kotlinandroid.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sidrakotlin.kotlinandroid.databinding.LayoutSecondBinding

class SecondActivity:AppCompatActivity() {
    private lateinit var binding: LayoutSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //back
        binding.back.setOnClickListener{
            finish();
        }

        //apply to set data on textviews
        binding.apply {
            textViewName.text="Virat Kohli"
            textView2.text="The Cricket Star"
        }
    }
}