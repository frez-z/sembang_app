package com.frezz.sembang

import android.app.Activity
import android.os.Bundle
import com.frezz.sembang.databinding.ActivityPasswordBinding

class PasswordActivity: Activity() {
    private lateinit var binding: ActivityPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}