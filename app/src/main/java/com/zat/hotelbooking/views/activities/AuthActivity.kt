package com.zat.hotelbooking.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseActivity

class AuthActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }

    override fun attachViewMode() {
    }
}



