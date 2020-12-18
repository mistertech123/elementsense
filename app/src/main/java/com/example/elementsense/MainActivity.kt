package com.example.elementsense

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    fun update() {
        val simpleDateFormat = SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")
        val currentDateAndTime: String = simpleDateFormat.format(Date())
        val textView: TextView = findViewById(R.id.dateAndTime)
        textView.text = currentDateAndTime
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        update()
    }
    override fun onRestart() {
        super.onRestart()
        update()
    }
}