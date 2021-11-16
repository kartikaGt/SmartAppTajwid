package com.pastibisa.smarttajwidapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageButton
import android.widget.SeekBar
import android.widget.TextView

class DetailTajwidActivity : AppCompatActivity() {

    private lateinit var judul : TextView
    private lateinit var pengertian : TextView
    private lateinit var play_btn: ImageButton
    private lateinit var seekbar: SeekBar
    companion object {
        const val EXTRA_JUDUL = "extra_judul"
        const val EXTRA_PENGERTIAN = "extra_pengertian"
        const val EXTRA_AUDIO = "extra_audio"
    }
    lateinit var runnable: Runnable
    private var handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tajwid)
        judul = findViewById(R.id.tvjudul)
        pengertian = findViewById(R.id.tvpengertian)
        play_btn = findViewById(R.id.play_btn)
        seekbar = findViewById(R.id.seekbar)

        showData()
    }

    private fun showData() {
        judul.setText(intent.getStringExtra(EXTRA_JUDUL))
        pengertian.setText(intent.getStringExtra(EXTRA_PENGERTIAN))
        val mediaplayer : MediaPlayer = MediaPlayer.create(this, intent.getIntExtra(EXTRA_AUDIO, 0))
        seekbar.progress = 0
        seekbar.max = mediaplayer.duration
        play_btn.setOnClickListener {
            if (!mediaplayer.isPlaying){
                mediaplayer.start()
                play_btn.setImageResource(R.drawable.ic_baseline_pause_24)
            }else{
                mediaplayer.pause()
                play_btn.setImageResource(R.drawable.ic_baseline_play_arrow_24)
            }
        }
        seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p2){
                    mediaplayer.seekTo(p1)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }
        })
        runnable = Runnable {
            seekbar.progress = mediaplayer.currentPosition
            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
        mediaplayer.setOnCompletionListener {
            play_btn.setImageResource(R.drawable.ic_baseline_play_arrow_24)
            seekbar.progress = 0
        }
    }
}