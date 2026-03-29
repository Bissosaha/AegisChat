package com.example.aegischat

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Step 1: Find the text and the button using their IDs
        val greetingText = findViewById<TextView>(R.id.myGreetingText)
        val clickButton = findViewById<Button>(R.id.myFirstButton)

// Step 2 & 3: Listen for the click, and change the text
        clickButton.setOnClickListener {
            greetingText.text = "I built my first App!"
        }
    }
}