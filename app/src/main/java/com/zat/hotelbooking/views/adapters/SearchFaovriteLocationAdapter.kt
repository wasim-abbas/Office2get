package com.zat.hotelbooking.views.adapters

import android.content.Context
import android.view.View
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseViewHolder
import com.zat.hotelbooking.utils.singleClick

class SearchFaovriteLocationAdapter(var context: Context, var onClick: (String) -> Unit) :
    com.zat.hotelbooking.base.BaseAdapter<SearchFaovriteLocationAdapter.
    SearchFavoriteLocationViewHolder, String>() {

    class SearchFavoriteLocationViewHolder(itemView: View) : BaseViewHolder(itemView) {}

    override val layoutId: Int
        get() = R.layout.item_view_search_location

    override fun setData(holder: SearchFavoriteLocationViewHolder, model: String, position: Int) {
        var view = holder.itemView

        view.singleClick {
            onClick(model)
        }
    }


}


