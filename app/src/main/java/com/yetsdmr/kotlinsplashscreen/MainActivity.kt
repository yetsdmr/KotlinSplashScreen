package com.yetsdmr.kotlinsplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class MainActivity : AppCompatActivity() {

    var runnable : Runnable = Runnable {  }
    var handler : Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        runnable = object : Runnable {
            override fun run() {
                val intent = Intent(this@MainActivity,HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        handler.postDelayed(runnable,3000)

    }
}