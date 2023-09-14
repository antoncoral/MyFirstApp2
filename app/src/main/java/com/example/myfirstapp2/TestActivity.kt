package com.example.myfirstapp2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp2.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    private lateinit var bindingClass: ActivityTestBinding

    val lostArray = arrayOf(1000, 2300, 45000, 65000, 6500, 400)
    val earnArray = arrayOf(15000, 300, 345000, 5000, 16500, 3400)
    val resultArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val name = resources.getStringArray(R.array.names)

        for((index, name) in name.withIndex()) {

            resultArray.add("Имя: $name - прибыль = ${earnArray[index] - lostArray[index]}")
            Log.d("MyLog", "Статистика -/- ${resultArray[index]}")
        }

    }



}