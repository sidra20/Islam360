package com.sidrakotlin.kotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sidrakotlin.kotlinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root);

        binding.submit.setOnClickListener {
            var name:String = binding.nameEt.text.toString();
            if(name.isEmpty())
            {
                Toast.makeText(this, "Field is required!", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Hello " + name, Toast.LENGTH_SHORT).show();

            }
        }


    }
}