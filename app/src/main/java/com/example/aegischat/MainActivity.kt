package com.example.aegischat

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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
        val inputField = findViewById<EditText>(R.id.userInputField)


// Step 2 & 3: Listen for the click, and change the text
        clickButton.setOnClickListener {
            //  greetingText.text = "I built my first App!"
            val username = inputField.text.toString()
            if (username.isEmpty()) {
                Toast.makeText(this, "Please Enter your name!", Toast.LENGTH_SHORT).show()
            } else {
                greetingText.text = "Hello $username!"

            }
        }
    }
}