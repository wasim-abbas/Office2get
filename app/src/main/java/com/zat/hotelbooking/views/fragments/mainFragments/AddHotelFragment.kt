package com.zat.hotelbooking.views.fragments.mainFragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.singleClick
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.activities.HostMainActivity
import kotlinx.android.synthetic.main.fragment_add_hotel.*


class AddHotelFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_add_hotel
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {

        btnProceed.singleClick {
            startActivity(Intent(currentActivity(),HostMainActivity::class.java))

        }
    }

}