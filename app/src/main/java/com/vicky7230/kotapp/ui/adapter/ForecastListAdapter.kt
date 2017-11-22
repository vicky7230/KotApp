package com.vicky7230.kotapp.ui.adapter

import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.vicky7230.kotapp.domain.model.ForecastList

/**
 * Created by vicky on 20/11/17.
 */
class ForecastListAdapter(val weekForecast: ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ItemHolder>() {


    override fun onBindViewHolder(holder: ItemHolder?, position: Int) {
        with(weekForecast.dailyForecast[position]) {
            holder?.textView?.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int = weekForecast.dailyForecast.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemHolder =
            ItemHolder(AppCompatTextView(parent?.context))

    class ItemHolder(val textView: AppCompatTextView?) : RecyclerView.ViewHolder(textView)
}