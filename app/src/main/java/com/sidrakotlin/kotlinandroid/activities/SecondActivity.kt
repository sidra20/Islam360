package com.sidrakotlin.kotlinandroid.activities

import android.content.Intent
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

        //move to ignore binding activity
        binding.textViewIgnore.setOnClickListener{
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
        //apply to set data on textviews
        binding.apply {
            textViewName.text="Virat Kohli"
            textView2.text="The Cricket Star"
        }
    }
}