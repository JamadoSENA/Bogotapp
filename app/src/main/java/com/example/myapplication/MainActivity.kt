package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashscreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        splashscreen.setKeepOnScreenCondition { true }
        val intent = Intent(this, MenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}