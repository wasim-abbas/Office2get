package com.zat.hotelbooking.views.adapters

import android.content.Context
import android.view.View
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseAdapter
import com.zat.hotelbooking.base.BaseViewHolder
import com.zat.hotelbooking.utils.singleClick

class BookingRequestAdapter(var context: Context, var onClcik: () -> Unit) :
    BaseAdapter<BookingRequestAdapter.BookinRequestViewHolder, String>() {

    class BookinRequestViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_booking_request

    override fun setData(holder: BookinRequestViewHolder, model: String, position: Int) {
        var view = holder.itemView

        view.singleClick {

        }
    }

    override fun getItemCount() = 6
}