package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme6Activity : AppCompatActivity() {
    lateinit var btnPrevious: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme6)

        btnPrevious = findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            val intent= Intent(this, Meme5Activity::class.java)
            startActivity(intent)
        }
    }
}