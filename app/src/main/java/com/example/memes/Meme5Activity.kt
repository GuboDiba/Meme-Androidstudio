package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Meme5Activity : AppCompatActivity() {
    lateinit var btnPrevious: Button
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)

        btnPrevious = findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            val intent= Intent(this, Meme3Activity::class.java)
            startActivity(intent)
        }
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent= Intent(this, Meme6Activity::class.java)
            startActivity(intent)
        }

    }
}
