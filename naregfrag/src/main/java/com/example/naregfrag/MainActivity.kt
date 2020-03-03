package com.example.naregfrag

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_text.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            textFragment.text = editText.text.toString()

            textFragment.animate().alpha(0f).setDuration(4000)

        }

    }

    override fun onRestart() {
        super.onRestart()
        val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.pig)
        mediaPlayer.start()
    }
}
