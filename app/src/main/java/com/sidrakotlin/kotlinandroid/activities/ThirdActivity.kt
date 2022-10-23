package com.sidrakotlin.kotlinandroid.activities

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sidrakotlin.kotlinandroid.R

class ThirdActivity:AppCompatActivity() {
    private lateinit var back:ImageView;
    private lateinit var text:TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_third);

        init();

    }
    private fun init()
    {
        back = findViewById(R.id.back)
        text = findViewById(R.id.thirdLayoutText)

        back.setOnClickListener {
            finish()
        }
        text.text="Hello World!"
    }
}