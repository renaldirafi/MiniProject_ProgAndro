package com.example.miniproject1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.button2)


        btn2.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
     }
}