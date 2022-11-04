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
import kotlinx.android.synthetic.main.fragment_payment.*


class PaymentFragment: BaseFragment<BaseViewModel>() {

   override val layoutId: Int
      get() = R.layout.fragment_payment
   override val viewModelClass: Class<BaseViewModel>
      get() = BaseViewModel::class.java

   override fun observeLiveData() {
   }

   override fun init() {

      btnSave.singleClick { currentActivity().replaceMainFragment(R.id.action_paymentFragment_to_paymentDoneFragment) }
   }
}