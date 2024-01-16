package com.example.all_android_basics_tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val backButtonId = findViewById<Button>(R.id.backButton)
        backButtonId.setOnClickListener{
            finish()
        }
    }
}