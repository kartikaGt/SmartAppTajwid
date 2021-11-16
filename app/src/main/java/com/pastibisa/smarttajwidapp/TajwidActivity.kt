package com.pastibisa.smarttajwidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TajwidActivity : AppCompatActivity() {
    private lateinit var rvtajwid: RecyclerView
    private val list= ArrayList<Tajwid>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tajwid)

        rvtajwid = findViewById(R.id.rv_tajwid)
        rvtajwid.setHasFixedSize(true)
        list.addAll(Data.ListDataTajwid)
        rvtajwid.layoutManager = LinearLayoutManager(this)
        val tajwidAdapter = TajwidAdapter(list)
        rvtajwid.adapter = tajwidAdapter

        tajwidAdapter.setOnItemClickCallback(
            object : TajwidAdapter.OnItemClickCallback{
                override fun onItemClick(data: Tajwid) {
                    //ini untuk memunculkan notifikasi
//                    Toast.makeText(this@TajwidActivity, "Anda memilih ${data.judul}",
//                    Toast.LENGTH_SHORT).show()
                    val pindahDenganData= Intent(this@TajwidActivity,DetailTajwidActivity::class.java).apply {
                        putExtra(DetailTajwidActivity.EXTRA_JUDUL,
                            data.judul)
                        putExtra(DetailTajwidActivity.EXTRA_PENGERTIAN,
                            data.pengertian)
                        putExtra(DetailTajwidActivity.EXTRA_AUDIO, data.audio)
                    }
                    startActivity(pindahDenganData)
                }

            }
        )
    }
}