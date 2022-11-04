package com.zat.hotelbooking.views.fragments.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.dummyList
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.adapters.SearchFaovriteLocationAdapter
import kotlinx.android.synthetic.main.fragment_search_location.*

class SearchLocationFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_search_location
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var searchFaovriteLocationAdapter: SearchFaovriteLocationAdapter

    override fun observeLiveData() {

    }

    override fun init() {

        searchFaovriteLocationAdapter = SearchFaovriteLocationAdapter(currentActivity()) {
            currentActivity().replaceMainFragment(R.id.
            action_searchLocationFragment_to_hotelCenterDetailFragment)
        }

        searchFaovriteLocationAdapter.updateData(dummyList)

        RvSearchFavoritePlaces.let {
            it.adapter = searchFaovriteLocationAdapter
        }


    }

}