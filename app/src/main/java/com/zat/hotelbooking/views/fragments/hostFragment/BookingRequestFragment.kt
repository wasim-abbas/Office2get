package com.zat.hotelbooking.views.fragments.hostFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.adapters.BookingRequestAdapter
import kotlinx.android.synthetic.main.fragment_booking_request.*


class BookingRequestFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_booking_request
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var bookingRequestAdapter: BookingRequestAdapter

    override fun observeLiveData() {}

    override fun init() {

        bookingRequestAdapter= BookingRequestAdapter(currentActivity()){

        }
        RVBookingRequest.let {
            it.adapter=bookingRequestAdapter
        }

    }

}