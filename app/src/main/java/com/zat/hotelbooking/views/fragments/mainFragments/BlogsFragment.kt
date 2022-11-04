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
import com.zat.hotelbooking.views.adapters.BlogsAdapter
import kotlinx.android.synthetic.main.fragment_blogs.*


class BlogsFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_blogs
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java
    private lateinit var blogsAdapter: BlogsAdapter

    override fun observeLiveData() {
    }

    override fun init() {
        blogsAdapter = BlogsAdapter(currentActivity()) {

            currentActivity().replaceMainFragment(R.id.action_blogsFragment_to_blogDetailFragment)
        }
        blogsAdapter.updateData(dummyList)
        RVBlogs.let {
            it.adapter = blogsAdapter
        }

    }

}