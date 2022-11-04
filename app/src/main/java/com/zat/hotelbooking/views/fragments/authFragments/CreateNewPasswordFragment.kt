package com.zat.hotelbooking.views.fragments.authFragments

import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.singleClick
import com.zat.hotelbooking.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_create_new_password.*
import kotlinx.android.synthetic.main.fragment_forgot_password.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.btnForgotPassWord


class CreateNewPasswordFragment: BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_create_new_password
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }

    override fun init() {
        btnUpdatePass.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.loginFragment)
        }


    }

}