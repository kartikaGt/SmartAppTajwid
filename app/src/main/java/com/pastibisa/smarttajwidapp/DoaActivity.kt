package com.pastibisa.smarttajwidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DoaActivity : AppCompatActivity() {
    private lateinit var rvdoa: RecyclerView
    private val list= ArrayList<Doa>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa)

        rvdoa = findViewById(R.id.rv_doa)
        rvdoa.setHasFixedSize(true)
        list.addAll(Data.ListDataDoa)
        rvdoa.layoutManager = LinearLayoutManager(this)
        val doaAdapter = DoaAdapter(list)
        rvdoa.adapter = doaAdapter
    }
}