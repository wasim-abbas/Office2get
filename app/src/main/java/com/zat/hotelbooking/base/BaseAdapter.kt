package com.zat.hotelbooking.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zat.hotelbooking.R
import com.zat.hotelbooking.views.adapters.*

abstract class BaseAdapter<VH : BaseViewHolder, D> : RecyclerView.Adapter<VH>() {

    abstract val layoutId: Int
    abstract fun setData(holder: VH, model: D, position: Int)

    private var list = ArrayList<D>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {

        return when (layoutId) {
            R.layout.item_sechdule ->
                ScheduleAdapter.ScheduleViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH
            R.layout.item_view_blogs->
                BlogsAdapter.BlogsViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId,parent,false)
                ) as VH

            R.layout.item_view_chatting ->
                MessagesAdapter.MessageViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

            R.layout.item_view_favorite_places ->
                FavoritePlacesAdapter.FavoriteViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

            R.layout.item_view_search_location ->
                SearchFaovriteLocationAdapter.SearchFavoriteLocationViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

            R.layout.item_booking_request ->
                BookingRequestAdapter.BookinRequestViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

            R.layout.item_host_img ->
                ImagesAdapter.ImagesViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH
            R.layout.item_view_notification ->
                NotificationAdapter.NotificationViewHolder(
                    LayoutInflater.from(
                        parent.context
                    ).inflate(layoutId, parent, false)
                ) as VH

//            R.layout.item_view_favorite_places ->
            else -> PlacesAdapter.PlcacViewHolder(
                LayoutInflater.from(
                    parent.context
                ).inflate(layoutId, parent, false)
            ) as VH

        }
    }


    override fun onBindViewHolder(holder: VH, position: Int) {
        if (list.size > 0)
            setData(holder, list[position], position)
    }

        override fun getItemCount() = list.size

    fun updateData(newList: ArrayList<D>) {
        list = newList
        notifyDataSetChanged()
    }

    fun clearData() {
        list.clear()
        notifyDataSetChanged()
    }
}