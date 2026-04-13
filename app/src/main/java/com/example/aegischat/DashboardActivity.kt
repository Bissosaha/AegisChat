package com.example.aegischat

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        //Unpack the backpack using the extra same tag "USER_NAME"
        val passedName = intent.getStringExtra("USER_NAME")
        //Find the text box onm the screen using it's ID"
        val welcome = findViewById<TextView>(R.id.dashboardGreetiingText)
        //Set the new dynamic textb with the name and an emoji!
        welcome.text = "Welcome to the Dashboard, $passedName🚀"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}