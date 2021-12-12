package com.frezz.sembang

import android.app.Application
import com.google.firebase.auth.FirebaseAuth

class App : Application() {
    companion object {
        lateinit var auth: FirebaseAuth
    }
}