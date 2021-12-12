package com.frezz.sembang

import android.app.Activity
import android.os.Bundle
import com.frezz.sembang.databinding.ActivityVerifyBinding


class VerifyActivity: Activity() {
    private lateinit var binding: ActivityVerifyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerifyBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}