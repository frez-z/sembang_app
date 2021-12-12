package com.frezz.sembang

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.frezz.sembang.databinding.ActivityRegisterBinding

class RegisterActivity: Activity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRegister.setOnClickListener {
            val intent = Intent(this, VerifyActivity::class.java)
            startActivity(intent)
        }
    }
}