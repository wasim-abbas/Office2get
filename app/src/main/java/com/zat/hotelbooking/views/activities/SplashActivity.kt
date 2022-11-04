package com.zat.hotelbooking.views.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zat.hotelbooking.R
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splesh)

        MainScope().launch {
            delay(3000)
            startActivity(Intent(this@SplashActivity, AuthActivity::class.java))
            finish()
        }


    }
}