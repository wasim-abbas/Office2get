package com.zat.hotelbooking.views.adapters

import android.content.Context
import android.view.View
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseAdapter
import com.zat.hotelbooking.base.BaseViewHolder
import com.zat.hotelbooking.utils.singleClick

class ImagesAdapter(var context: Context, var onClcik: () -> Unit) :
    BaseAdapter<ImagesAdapter.ImagesViewHolder, String>() {

    class ImagesViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_host_img

    override fun setData(holder: ImagesViewHolder, model: String, position: Int) {
        var view = holder.itemView

        view.singleClick {

        }
    }

    override fun getItemCount() = 5
}