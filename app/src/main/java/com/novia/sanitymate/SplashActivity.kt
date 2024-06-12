package com.novia.sanitymate

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val splashTimeOut: Long = 1000 // 1 second

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // Start navigation activity
            startActivity(Intent(this, NavigationActivity::class.java))
            // Close splash activity
            finish()
        }, splashTimeOut)
    }
}
