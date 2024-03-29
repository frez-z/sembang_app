package com.frezz.sembang

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.frezz.sembang.databinding.ActivityMainBinding




class MainActivity : Activity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        window.setBackgroundDrawableResource(R.drawable.background_default)
        setContentView(binding.root)


        binding.sendButton.setOnClickListener {
            Toast.makeText(this,binding.sendText.text.toString(), Toast.LENGTH_SHORT).show()
            binding.sendText.setText("")
        }
    }
}