package com.zat.hotelbooking.views.fragments.hostFragment


import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.adapters.MessagesAdapter
import kotlinx.android.synthetic.main.fragment_messages.*


class MessagesFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_messages
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var messagesAdapter: MessagesAdapter

    override fun observeLiveData() {}

    override fun init() {

        messagesAdapter= MessagesAdapter(currentActivity()){

        }

        RVMessages.let{
            it.adapter= messagesAdapter
        }

    }

}