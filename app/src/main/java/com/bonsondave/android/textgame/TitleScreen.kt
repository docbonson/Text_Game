package com.bonsondave.android.textgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TitleScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_screen)

        val btnStart: Button = findViewById(R.id.btn_start)

        btnStart.setOnClickListener {
            val intent = Intent(this,GameScreen::class.java)
            startActivity(intent)
        }
    }
}