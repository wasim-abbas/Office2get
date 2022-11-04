package com.zat.hotelbooking.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseActivity

class HostMainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host_main)
    }

    override fun attachViewMode() {
    }
}