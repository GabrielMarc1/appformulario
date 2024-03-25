package com.example.appformulario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.showButton)
        val editText = findViewById<EditText>(R.id.showPhone)

        showButton.setOnClickListener {
            val text = editText.text.toString()
            // Correção do Toast
            Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
        }
    }
}
