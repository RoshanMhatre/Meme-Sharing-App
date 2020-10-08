
package com.example.memeShare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler as Handler1

class SplashScreen : AppCompatActivity() {
    lateinit var handler: Handler1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        handler = Handler1()
        handler.postDelayed({
            val intent =  Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}