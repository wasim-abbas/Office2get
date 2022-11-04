package com.zat.hotelbooking.base

import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zat.hotelbooking.utils.obtainViewModel
import com.zat.hotelbooking.viewModels.BaseViewModel
import com.zat.hotelbooking.views.activities.AuthActivity
import com.zat.hotelbooking.views.activities.HostMainActivity
import com.zat.hotelbooking.views.activities.MainActivity

abstract class BaseFragment <V : BaseViewModel> : Fragment() {

    abstract val layoutId: Int
    abstract val viewModelClass: Class<V>
    lateinit var viewModel: V

    private lateinit var mActivity: BaseActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = obtainViewModel(viewModelClass)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        observeLiveData()

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        mActivity = when (context) {

            is AuthActivity -> context as AuthActivity
            is MainActivity -> context as MainActivity
            is HostMainActivity -> context as HostMainActivity
         //   is BoardingActivity -> context as BoardingActivity

            else -> context as BaseActivity
        }
    }

    open fun hideLoadingBar() {
        mActivity.hideLoadingBar()
    }

    open fun showLoadingBar() {
        mActivity.showLoadingBar()
    }

    open fun showToast(message: String?) {
        currentActivity().showToast(message)
    }

    open fun currentActivity() = mActivity

    abstract fun observeLiveData()
    abstract fun init()

    fun getStringArgument(key: String) = arguments?.getString(key)
    fun getIntArgument(key: String) = arguments?.getInt(key,-1)
    fun getBooleanArgument(key: String) = arguments?.getBoolean(key)
    fun <T>getParcelableArgument(key: String)= arguments?.getParcelable<Parcelable>(key) as T


}