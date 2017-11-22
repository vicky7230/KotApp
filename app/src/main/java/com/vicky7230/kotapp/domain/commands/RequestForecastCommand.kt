package com.vicky7230.kotapp.domain.commands

import com.vicky7230.kotapp.data.ForecastRequest
import com.vicky7230.kotapp.domain.mapper.ForecastDataMapper
import com.vicky7230.kotapp.domain.model.ForecastList

/**
 * Created by vicky on 22/11/17.
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}