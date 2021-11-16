package com.pastibisa.smarttajwidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        val btn_easy: CardView = findViewById(R.id.easy)
        val btn_medium: CardView = findViewById(R.id.medium)
        val btn_hard: CardView = findViewById(R.id.hard)
        btn_easy.setOnClickListener {
            startActivity(Intent(this@QuizActivity,QuizEasyActivity::class.java))
        }
        btn_medium.setOnClickListener {
            startActivity(Intent(this@QuizActivity,QuizMediumActivity::class.java))
        }
        btn_hard.setOnClickListener {
            startActivity(Intent(this@QuizActivity,QuizHardActivity::class.java))
        }
    }
}