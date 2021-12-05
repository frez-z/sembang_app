package com.frezz.sembang

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.frezz.sembang.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : Activity() {
    private var isRunning = false
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        window.setBackgroundDrawableResource(R.drawable.wallpapers);
        setContentView(binding.root)

        binding.sendButton.setOnClickListener {
            Toast.makeText(this,binding.sendText.text.toString(), Toast.LENGTH_SHORT).show()
            binding.sendText.setText("")
        }
//        val intent = Intent(this, ShowActivity::class.java)
//        startActivity(intent)
//        this.finish() // end current activity
    }

    override fun onStart() {
        super.onStart()
    }
}