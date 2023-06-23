package com.example.calcxablauactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_result : AppCompatActivity() {
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        textViewResult = findViewById(R.id.textViewResult)

        val result = intent.getIntExtra("result", 0)
        textViewResult.text = "Resultado: $result"

    }
}