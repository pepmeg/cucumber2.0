package com.example.counterapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private lateinit var counterText: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterText = findViewById(R.id.counterText)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            counter++
            counterText.text = counter.toString()
            Log.i("CounterApp", "Кнопка нажата. Текущее значение счетчика: $counter")
        }
        button.setOnLongClickListener {
            counter = 0
            counterText.text = counter.toString()
            Log.i("CounterApp", "Долгое нажатие: Счетчик сброшен на 0")
            true
        }
    }
}
