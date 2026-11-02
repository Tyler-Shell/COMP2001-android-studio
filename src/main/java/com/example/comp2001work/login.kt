package com.example.comp2001work

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {

    private lateinit var login_button: Button
    private lateinit var login2_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        login_button = findViewById<Button>(R.id.login)

        login_button.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        login2_button = findViewById<Button>(R.id.login2)

        login2_button.setOnClickListener {
            val intent = Intent(this, homemanager::class.java)
            startActivity(intent)
        }
    }
}