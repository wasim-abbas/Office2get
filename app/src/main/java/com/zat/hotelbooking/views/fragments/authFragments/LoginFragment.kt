package com.zat.hotelbooking.views.fragments.authFragments

import android.content.Intent
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.singleClick
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.activities.MainActivity
import kotlinx.android.synthetic.main.fragment_auth_home.*
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment() : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_login
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {

    }

    override fun init() {

        btnSignin.singleClick {
            startActivity(Intent(currentActivity(), MainActivity::class.java))
        }
        btnForgotPassWord.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
    }


}