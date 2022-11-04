package com.zat.hotelbooking.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseActivity
import com.zat.hotelbooking.utils.singleClick
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_va_layout2.*
import kotlinx.android.synthetic.main.side_navigation_drawer.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = Navigation.findNavController(
            this,
            R.id.navMainHomeHost
        )

        NavigationUI.setupWithNavController(bottom_Navigation, navController)
        sideDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)

        llNotification.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment_to_notificationsFragment2)

        }
        txtBlogs.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment_to_blogsFragment)
        }
        llTerms.singleClick {
            sideDrawer.closeDrawer(GravityCompat.START)
            replaceMainFragment(R.id.action_homeFragment_to_termsAndConditionFragment)
        }
       // llPrivacy.singleClick { }
    }

    fun toggleDrawer() {
        if (sideDrawer.isDrawerOpen(GravityCompat.START)) {
            sideDrawer.closeDrawer(GravityCompat.START)

        } else {
            sideDrawer.openDrawer(GravityCompat.START)
        }
    }
    override fun attachViewMode() {
    }
}