package com.zat.hotelbooking.views.adapters

import android.content.Context
import android.view.View
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseAdapter
import com.zat.hotelbooking.base.BaseViewHolder
import com.zat.hotelbooking.utils.singleClick

class BlogsAdapter(var context: Context,var onClick:(String)->Unit):
BaseAdapter<BlogsAdapter.BlogsViewHolder,String>() {
    class BlogsViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_blogs

    override fun setData(holder: BlogsViewHolder, model: String, position: Int) {
        var view = holder.itemView

        view.singleClick {
            onClick(model)
        }
    }

}