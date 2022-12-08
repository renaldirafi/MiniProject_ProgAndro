package com.example.miniproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val btnhome = findViewById<Button>(R.id.btnhome)
        btnhome.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}