package com.zat.hotelbooking.views.fragments.hostFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.adapters.ImagesAdapter
import kotlinx.android.synthetic.main.fragment_host_profile.*

class HostProfileFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_host_profile
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var imagesAdapter: ImagesAdapter

    override fun observeLiveData() {
    }

    override fun init() {

        imagesAdapter = ImagesAdapter(currentActivity()){

        }
        RViamges.let {
            it.adapter= imagesAdapter
        }
    }

}