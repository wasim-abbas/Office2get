package com.zat.hotelbooking.views.fragments.mainFragments


import android.os.Build
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.view.children
import com.kizitonwose.calendarview.model.CalendarDay
import com.kizitonwose.calendarview.model.CalendarMonth
import com.kizitonwose.calendarview.model.DayOwner
import com.kizitonwose.calendarview.ui.DayBinder
import com.kizitonwose.calendarview.ui.MonthHeaderFooterBinder
import com.kizitonwose.calendarview.ui.ViewContainer
import com.kizitonwose.calendarview.utils.next
import com.kizitonwose.calendarview.utils.previous
import com.zat.hotelbooking.R
import com.zat.hotelbooking.base.BaseFragment
import com.zat.hotelbooking.utils.*
import com.zat.hotelbooking.viewModels.BaseViewModel
import kotlinx.android.synthetic.main.calendar_header.view.*
import kotlinx.android.synthetic.main.fragment_availibility.*
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_search.searchCalendar
import kotlinx.android.synthetic.main.fragment_search.imgNext
import kotlinx.android.synthetic.main.fragment_search.imgPrevious
import kotlinx.android.synthetic.main.fragment_search.tvMonth
import java.time.LocalDate
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.time.format.TextStyle
import java.util.*


class SearchFragment : BaseFragment<BaseViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_search
    override val viewModelClass: Class<BaseViewModel>
        get() = BaseViewModel::class.java

    private var date: String = ""

    override fun observeLiveData() {
    }

    override fun init() {

        txtClanderdropDown.singleClick {
            llCalandercard.visible()
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                peopleSpinner.isEnabled = false
                initCalendar()
            }
        }

        btnSearch.singleClick {
            currentActivity().replaceMainFragment(R.id.action_searchFragment_to_searchLocationFragment)
        }

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initCalendar() {

        var selectedDate: LocalDate? = null
        val today = LocalDate.now()
        var daysOfWeek = daysOfWeekFromLocale()
        val currentMonth = YearMonth.now()



        searchCalendar.setup(
            currentMonth.minusMonths(10),
            currentMonth.plusMonths(10),
            daysOfWeek.first()
        )

        searchCalendar.scrollToMonth(currentMonth)
        class DayViewContainer(view: View) : ViewContainer(view) {
            lateinit var day: CalendarDay
            val textView = view.findViewById<TextView>(R.id.exTwoDayText)

            init {
                textView.setOnClickListener {
                    if (day.owner == DayOwner.THIS_MONTH) {
                        if (selectedDate == day.date) {
                            selectedDate = null
                            searchCalendar.notifyDayChanged(day)
                        } else {
                            val oldDate = selectedDate
                            selectedDate = day.date
                            searchCalendar.notifyDateChanged(day.date)
                            oldDate?.let { searchCalendar.notifyDateChanged(oldDate) }
                        }
                    }
                }
            }
        }



        searchCalendar.dayBinder = object : DayBinder<DayViewContainer> {
            override fun create(view: View) = DayViewContainer(view)
            override fun bind(container: DayViewContainer, day: CalendarDay) {
                container.day = day
                val textView = container.textView
                textView.text = day.date.dayOfMonth.toString()


                if (day.owner == DayOwner.THIS_MONTH) {
                    textView.visible()
                    when (day.date) {
                        selectedDate -> {
                            textView.setTextColorRes(R.color.black)
                            textView.setBackgroundResource(R.drawable.selected_day_bg)
                            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
                            date = day.date.format(formatter)
//
//                            showLoadingBar()
//                            var viewPurchase = ViewPurchaseRequest(date)
//                            viewModel.viewPurchase(user_id!!, viewPurchase)

                            peopleSpinner.isEnabled = true
                            llCalandercard.gone()

                        }
                        today -> {
                            textView.setTextColorRes(R.color.back_arrow_color)
                            textView.background = null
                        }
                        else -> {
                            textView.setTextColorRes(R.color.back_arrow_color)
                            textView.background = null
                        }
                    }

                } else {
                    textView.gone()

                }
            }
        }


        searchCalendar.monthScrollListener = { month ->
            val title = "${monthTitleFormatter.format(month.yearMonth)} ${month.yearMonth.year}"
            tvMonth.text = title

            selectedDate?.let {
                // Clear selection if we scroll to a new month.
                selectedDate = null
                searchCalendar.notifyDateChanged(it)
            }
        }

        imgNext.setOnClickListener {
            searchCalendar.findFirstVisibleMonth()?.let {
                searchCalendar.smoothScrollToMonth(it.yearMonth.next)
            }
        }

        imgPrevious.setOnClickListener {
            searchCalendar.findFirstVisibleMonth()?.let {
                searchCalendar.smoothScrollToMonth(it.yearMonth.previous)
            }
        }

        class MonthViewContainer(view: View) : ViewContainer(view) {
            val legendLayout = view.legendLayout
        }
        searchCalendar.monthHeaderBinder = object :
            MonthHeaderFooterBinder<MonthViewContainer> {
            override fun create(view: View) = MonthViewContainer(view)
            override fun bind(container: MonthViewContainer, month: CalendarMonth) {
                // Setup each header day text if we have not done that already.
                if (container.legendLayout.tag == null) {
                    container.legendLayout.tag = month.yearMonth
                    container.legendLayout.children.map { it as TextView }
                        .forEachIndexed { index, tv ->
                            tv.text =
                                daysOfWeek[index].getDisplayName(TextStyle.SHORT, Locale.ENGLISH)
                                    .toUpperCase(Locale.ENGLISH)
                            tv.setTextColorRes(R.color.back_arrow_color)
                            tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
                        }
                    month.yearMonth



                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private val monthTitleFormatter = DateTimeFormatter.ofPattern("MMMM")
}

