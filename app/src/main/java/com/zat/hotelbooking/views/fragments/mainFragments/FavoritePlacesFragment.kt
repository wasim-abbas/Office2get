package com.zat.hotelbooking.views.fragments.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.adapters.FavoritePlacesAdapter
import kotlinx.android.synthetic.main.fragment_favorite_places.*


class FavoritePlacesFragment : BaseFragment<BaseViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_favorite_places
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private lateinit var favoritePlacesAdapter: FavoritePlacesAdapter

    override fun observeLiveData() {

    }

    override fun init() {

        favoritePlacesAdapter = FavoritePlacesAdapter(currentActivity()) {

        }

        RvFavoritePlaces.let {
            it.adapter = favoritePlacesAdapter
        }
    }

}