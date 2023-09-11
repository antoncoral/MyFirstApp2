package com.example.myfirstapp2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp2.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingClass = ActivityTestBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    }



}