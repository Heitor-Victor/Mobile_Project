package com.example.exercita_recife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        val register_button = findViewById<Button>(R.id.register_button2)

        register_button.setOnClickListener {
            registerSuccessful()
        }
    }
    fun registerSuccessful() {
        val registerSuccessful = Intent(this,RegisterSuccessful::class.java)
        startActivity(registerSuccessful)
    }
}