package com.zat.hotelbooking.views.fragments.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.singleClick
import com.zat.hotelbooking.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_hotel_center_detail.*


class HotelCenterDetailFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_hotel_center_detail
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {

        btnDesk.singleClick {
            currentActivity().replaceMainFragment(R.id.action_hotelCenterDetailFragment_to_addPaymentFragment)
        }
    }

}