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
    private lateinit var incrementButton: Button
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterText = findViewById(R.id.counterText)
        incrementButton = findViewById(R.id.incrementButton)
        resetButton = findViewById(R.id.resetButton)
        incrementButton.setOnClickListener {
            counter++
            counterText.text = counter.toString()
            Log.i("CounterApp", "Кнопка увеличения нажата. Текущее значение счетчика: $counter")
        }
        resetButton.setOnClickListener {
            counter = 0
            counterText.text = counter.toString()
            Log.i("CounterApp", "Кнопка сброса нажата. Счетчик сброшен на 0")
        }
    }
}
