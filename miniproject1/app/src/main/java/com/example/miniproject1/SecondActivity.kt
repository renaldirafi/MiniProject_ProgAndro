package com.example.miniproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val intent = Intent (this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}