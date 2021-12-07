package com.frezz.sembang

import android.app.Activity
import android.os.Bundle
import com.frezz.sembang.databinding.ActivityLoginBinding

class LoginActivity: Activity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}