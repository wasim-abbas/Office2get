package com.zat.hotelbooking.views.fragments.hostFragment

import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.singleClick
import com.zat.hotelbooking.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.fragment_host_main.*


class HostMainFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_host_main
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {
    }


    override fun init() {

        btnAvailibility.singleClick { currentActivity().replaceHostMainFragment(R.id.action_hostMainFragment_to_availibilityFragment) }
        btnConfirmBooings.singleClick { currentActivity().replaceHostMainFragment(R.id.action_hostMainFragment_to_bookingRequestFragment) }
        btnCompletedBooking.singleClick { currentActivity().replaceHostMainFragment(R.id.action_hostMainFragment_to_bookingCompleteFragment) }
        btnMychat.singleClick { currentActivity().replaceHostMainFragment(R.id.action_hostMainFragment_to_messagesFragment2) }
        btnMyProfile.singleClick { currentActivity().replaceHostMainFragment(R.id.action_hostMainFragment_to_hostProfileFragment) }
        btnMyNotification.singleClick { currentActivity().replaceHostMainFragment(R.id.action_hostMainFragment_to_notificationsFragment) }
        btnCreateInvoice.singleClick { currentActivity().replaceHostMainFragment(R.id.action_hostMainFragment_to_createInvoiceFragment) }
        btnMyIncome.singleClick { currentActivity().replaceHostMainFragment(R.id.action_hostMainFragment_to_totalIncomeFragment) }


    }


}