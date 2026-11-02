package com.example.comp2001work

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {

    private lateinit var settings_button: Button
    private lateinit var notis_button: Button
    private lateinit var bookings_button: Button
    private lateinit var book_button: Button
    private lateinit var guide_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        settings_button = findViewById<Button>(R.id.settings)
        settings_button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
        guide_button = findViewById<Button>(R.id.guide)
        guide_button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
        notis_button = findViewById<Button>(R.id.notis)
        notis_button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
        bookings_button = findViewById<Button>(R.id.currentbookings)
        bookings_button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }
        book_button = findViewById<Button>(R.id.book)
        book_button.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }

    }
}