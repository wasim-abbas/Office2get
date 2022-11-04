package com.zat.hotelbooking.views.fragments.hostFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.viewModels.BaseViewModel


class TotalIncomeFragment: BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_total_incomeragment
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    override fun observeLiveData() {

    }

    override fun init() {

    }

}