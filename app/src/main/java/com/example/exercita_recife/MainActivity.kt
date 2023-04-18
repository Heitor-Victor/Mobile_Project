package com.example.exercita_recife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val acess_button = findViewById<Button>(R.id.acess_button)
        val register_button = findViewById<Button>(R.id.register_button)

        acess_button.setOnClickListener {
            homeScreen()
        }

        register_button.setOnClickListener {
            registerScreen()
        }

    }

    fun homeScreen() {
        val homeScreen = Intent(this,HomeScreen::class.java)
        startActivity(homeScreen)
    }

    fun registerScreen() {
        val registerScreen = Intent(this,RegisterScreen::class.java)
        startActivity(registerScreen)
    }

    }
