package com.sidrakotlin.kotlinandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sidrakotlin.kotlinandroid.activities.SecondActivity
import com.sidrakotlin.kotlinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root);

        //back
        binding.back.setOnClickListener{
            finish()
        }

        //move to another activity
        binding.goToSecond.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java);
            startActivity(intent)
        }

        //on submit click event
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