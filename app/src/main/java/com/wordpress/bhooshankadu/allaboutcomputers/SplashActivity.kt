package com.wordpress.bhooshankadu.allaboutcomputers

import android.os.Bundle
import android.content.Intent
import android.app.Activity
import android.os.Handler



class SplashActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val secondsDelayed = 1
        Handler().postDelayed(Runnable {
            startActivity(Intent(this@SplashActivity,LanguageActivity::class.java))
            finish()
        }, secondsDelayed * 1500.toLong())
    }
}
