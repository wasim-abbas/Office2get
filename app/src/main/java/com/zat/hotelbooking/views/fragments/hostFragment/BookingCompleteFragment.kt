package com.zat.hotelbooking.views.fragments.hostFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.adapters.ScheduleAdapter
import kotlinx.android.synthetic.main.fragment_booking.*
import kotlinx.android.synthetic.main.fragment_booking_complete.*


class BookingCompleteFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_booking_complete
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var schedulAdapter: ScheduleAdapter

    override fun observeLiveData() {
    }

    override fun init() {
        schedulAdapter = ScheduleAdapter(currentActivity()) {
        }

        RVPastBooking.let {
            it.adapter = schedulAdapter
        }
    }
}