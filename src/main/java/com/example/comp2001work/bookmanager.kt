package com.example.comp2001work

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class bookmanager : AppCompatActivity() {
    private lateinit var home3_button: Button
    private lateinit var room1_button: Button
    private lateinit var room2_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bookmanager)
        home3_button = findViewById<Button>(R.id.home4)
        home3_button.setOnClickListener {
            val intent = Intent(this, homemanager::class.java)
            startActivity(intent)
        }
        room1_button = findViewById<Button>(R.id.room1)
        room1_button.setOnClickListener {
            val intent = Intent(this, Room1_manager::class.java)
            startActivity(intent)
        }
        room2_button = findViewById<Button>(R.id.room2)
        room2_button.setOnClickListener {
            val intent = Intent(this, room2_manager::class.java)
            startActivity(intent)
        }
    }
}