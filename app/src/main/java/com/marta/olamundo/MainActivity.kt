package com.marta.olamundo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        val btnlogin = findViewById<Button>(R.id.btnlogin)
        setContentView( R.layout.activity_main)
    }
}