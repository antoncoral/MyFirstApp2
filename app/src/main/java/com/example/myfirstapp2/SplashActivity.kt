package com.example.myfirstapp2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


@SuppressLint("CustomSplashScreen")

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val text = findViewById<TextView>(R.id.textViewTest1)
        text.setOnClickListener {
            val intent = Intent(this, AutorizationActivity::class.java)
            startActivity(intent)
        }
    }


}