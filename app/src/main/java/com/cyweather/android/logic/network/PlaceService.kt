package com.cyweather.android.logic.network

import com.cyweather.android.CYWeatherApplication
import com.cyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * 描述：query cities api
 * @author Admin
 */
interface PlaceService {

    @GET("v2/place?token=${CYWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}