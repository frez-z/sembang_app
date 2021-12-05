package com.frezz.sembang

import android.app.Activity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.frezz.sembang.databinding.ActivityShowBinding
import kotlin.concurrent.thread

class ShowActivity : Activity() {
    private lateinit var binding : ActivityShowBinding
    private var aniRunning = false
    private var stringShow = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // start gif animation
        Glide.with(this).load(R.drawable.park_benchs).into(binding.iconAnimation)

        // setup button
        binding.loginButton.setOnClickListener {
            TODO("activity or fragment for login screen")
        }

        binding.registerButton.setOnClickListener {
            TODO("activity or fragment for register screen")
        }
    }

    override fun onStart() {
        super.onStart()
        if (!aniRunning){
            // reset animation before start new one.
            aniRunning = true ; stringShow = "" ; binding.changeText.text = stringShow
            thread {
                Thread.sleep(600)
                animateText("Sembang with your friend", 6, 400, false)
                animateText("family", 6, 300, false)
                animateText("lecture", 7, 250, false)
                animateText("engineer", 13, 200, false)
                animateText("everyone") // last animation.
                aniRunning = false
            }
        }
    }

    private fun animateText(str:String, clear:Int = 0, delay:Long = 0, last:Boolean = true) {
        val lastChar: Char = str.last()
        for (i in str){
            stringShow += i
            if ( i == lastChar && last){ runOnUiThread { binding.changeText.text = stringShow } }
            else { runOnUiThread { binding.changeText.text = (stringShow + '_') } }
            Thread.sleep(50)
        }
        if (last){ return }
        Thread.sleep(delay)
        for (i in 1..clear){
            stringShow = stringShow.dropLast(1)
            runOnUiThread { binding.changeText.text = (stringShow + '_') }
            Thread.sleep(50)
        }
    }
}