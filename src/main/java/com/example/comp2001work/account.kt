package com.example.comp2001work

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class account : AppCompatActivity() {
    private lateinit var home3_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_account)
        home3_button = findViewById<Button>(R.id.home2)
        home3_button.setOnClickListener {
            val intent = Intent(this, homemanager::class.java)
            startActivity(intent)
        }
    }
}