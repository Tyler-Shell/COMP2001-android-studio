package com.example.comp2001work

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class settings : AppCompatActivity() {
    private lateinit var logout_button: Button
    private lateinit var home_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        logout_button = findViewById<Button>(R.id.logout)
        logout_button.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        home_button = findViewById<Button>(R.id.home)
        home_button.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}