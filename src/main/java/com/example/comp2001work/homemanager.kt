package com.example.comp2001work

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homemanager : AppCompatActivity() {
    private lateinit var settings2_button: Button
    private lateinit var request_button: Button
    private lateinit var bookings_button: Button
    private lateinit var book_button: Button
    private lateinit var guide_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homemanager)
        settings2_button = findViewById<Button>(R.id.settings2)
        settings2_button.setOnClickListener {
            val intent = Intent(this, SettingsManager::class.java)
            startActivity(intent)
        }
        guide_button = findViewById<Button>(R.id.guide)
        guide_button.setOnClickListener {
            val intent = Intent(this, guide::class.java)
            startActivity(intent)
        }
        request_button = findViewById<Button>(R.id.request)
        request_button.setOnClickListener {
            val intent = Intent(this, request::class.java)
            startActivity(intent)
        }
        bookings_button = findViewById<Button>(R.id.currentbookings)
        bookings_button.setOnClickListener {
            val intent = Intent(this, currentbookings::class.java)
            startActivity(intent)
        }
        book_button = findViewById<Button>(R.id.book)
        book_button.setOnClickListener {
            val intent = Intent(this, bookmanager::class.java)
            startActivity(intent)
        }
    }
}