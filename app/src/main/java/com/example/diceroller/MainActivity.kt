package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button =findViewById(R.id.button_view)
        button.setOnClickListener{
            Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show()
        }
    }
}