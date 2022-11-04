package com.zat.hotelbooking.views.fragments.mainFragments

import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.singleClick
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.activities.MainActivity
import com.zat.hotelbooking.views.adapters.PlacesAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_home
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var PlacesAdapter: PlacesAdapter


    override fun observeLiveData() {
    }

    override fun init() {

        imgViewMenu.singleClick { (currentActivity() as MainActivity).toggleDrawer() }


        PlacesAdapter = PlacesAdapter(currentActivity()) {

        }

        RVFavPlaces.let {
            it.adapter = PlacesAdapter
        }

        btnBooking.singleClick {
            currentActivity().replaceMainFragment(R.id.action_homeFragment_to_bookinFragment)
        }
        btnFavorate_Places.singleClick {
            currentActivity().replaceMainFragment(R.id.action_homeFragment_to_favoritePlacesFragment)
        }
        btnPast_Booking.singleClick { currentActivity().replaceMainFragment(R.id.action_homeFragment_to_bookingCompleteFragment2) }
        btnPosting_Host.singleClick { currentActivity().replaceMainFragment(R.id.addHotelFragment) }

    }


}