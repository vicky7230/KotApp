package com.vicky7230.kotapp.domain.model

/**
 * Created by vicky on 22/11/17.
 */
data class ForecastList(val city: String, val country: String, val dailyForecast: List<Forecast>)

data class Forecast(val date: String, val description: String, val high: Int, val low: Int, val iconUrl: String)
