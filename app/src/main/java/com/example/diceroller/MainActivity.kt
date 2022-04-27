package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : Button =findViewById(R.id.button_view)
        button.setOnClickListener{
            randomNumber()
        }
    }

    private fun randomNumber() {
        val textView: TextView=findViewById(R.id.text_view);
        textView.text=(Random.nextInt(6)+1).toString()

    }
}