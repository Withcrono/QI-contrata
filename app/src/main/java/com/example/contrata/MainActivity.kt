package com.example.contrata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.botaoConectar)
        buttonClick.setOnClickListener {
            val intent = Intent(this, navbar::class.java)
            startActivity(intent)
        }
    }
}
