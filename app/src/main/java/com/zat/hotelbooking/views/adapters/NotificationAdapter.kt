package com.zat.hotelbooking.views.adapters

import android.content.Context
import android.view.View
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseAdapter
import com.zat.hotelbooking.base.BaseViewHolder
import com.zat.hotelbooking.utils.singleClick

class NotificationAdapter(var context: Context, var onClick: () -> Unit) :
    BaseAdapter<NotificationAdapter.NotificationViewHolder, String>() {
    class NotificationViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_notification

    override fun setData(holder: NotificationViewHolder, model: String, position: Int) {
        var view = holder.itemView

        view.singleClick {

        }
    }

    override fun getItemCount() = 6

}