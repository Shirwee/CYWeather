package com.cyweather.android.logic

import androidx.lifecycle.liveData
import com.cyweather.android.logic.model.Place
import com.cyweather.android.logic.network.CYWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException


/**
 * 描述：仓库层封装统一入口
 * @author Admin
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {

        val result = try {
            val placeResponse = CYWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }

        emit(result)
    }
}