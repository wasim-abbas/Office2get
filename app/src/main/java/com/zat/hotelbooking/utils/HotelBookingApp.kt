package com.zat.hotelbooking.utils

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import io.paperdb.Paper

class HotelBookingApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Paper.init(this)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}