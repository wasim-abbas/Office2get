package com.zat.hotelbooking.views.fragments.authFragments

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
import com.zat.hotelbooking.views.activities.AuthActivity
import com.zat.hotelbooking.views.activities.MainActivity
import kotlinx.android.synthetic.main.fragment_auth_home.*
import kotlinx.android.synthetic.main.fragment_sign_up.*


class AuthHomeFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_auth_home
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {}

    override fun init() {

        btnLogin.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.action_authHomeFragment_to_loginFragment)
        }
        btnRegister.singleClick {
            currentActivity().replaceFragmentInAuth(R.id.action_authHomeFragment_to_signUpFragment)
        }
        btnSkipAndBrowse.singleClick {
            startActivity(Intent(currentActivity(),MainActivity::class.java))
        }
    }


}