package com.zat.hotelbooking.views.fragments.authFragments

import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.singleClick
import com.zat.hotelbooking.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_forgot_password.*


class ForgotPasswordFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_forgot_password
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        btnReset.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.action_forgotPasswordFragment_to_createNewPasswordFragment)
        }
    }

}