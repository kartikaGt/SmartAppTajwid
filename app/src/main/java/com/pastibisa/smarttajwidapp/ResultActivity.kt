package com.pastibisa.smarttajwidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var Score : TextView
    private lateinit var tombol : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Score = findViewById(R.id.Score)
        tombol = findViewById(R.id.button)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val score=intent.getStringExtra(QuizData.score)
        val totalQuestion=intent.getStringExtra("total size")

        Score.text="${score} / ${totalQuestion}"
        tombol.setOnClickListener {
            startActivity(Intent(this,QuizActivity::class.java))
            finish()
        }
    }
}