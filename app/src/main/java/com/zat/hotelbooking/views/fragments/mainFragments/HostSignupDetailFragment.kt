package com.zat.hotelbooking.views.fragments.mainFragments

import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.viewModels.BaseViewModel


class HostSignupDetailFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_host_signup_detail
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
    }

}