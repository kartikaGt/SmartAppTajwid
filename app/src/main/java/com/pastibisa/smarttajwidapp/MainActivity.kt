package com.pastibisa.smarttajwidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_tajwid: CardView = findViewById(R.id.menutajwid)
        val btn_doa: CardView = findViewById(R.id.menudoa)
        val btn_quiz: CardView = findViewById(R.id.menuquiz)
        btn_tajwid.setOnClickListener {
            startActivity(Intent(this@MainActivity,TajwidActivity::class.java))
        }
        //bisa menggunakan cara ini / cara 1
        btn_doa.setOnClickListener {
            val pindahDoa = Intent(this@MainActivity, DoaActivity::class.java)
            startActivity(pindahDoa)
            //cara 2
            //startActivity(Intent(this@MainActivity,DoaActivity::class.java))
        }
        btn_quiz.setOnClickListener {
            startActivity(Intent(this@MainActivity,QuizActivity::class.java))
        }
    }
}