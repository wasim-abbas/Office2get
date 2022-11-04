package com.zat.hotelbooking.views.fragments.authFragments


import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.singleClick
import com.zat.hotelbooking.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_o_t_p.*


class OTPFragment:  BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_o_t_p
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java
    override fun observeLiveData() {
    }

    override fun init() {
        btnProceed.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.loginFragment)
        }

    }

}