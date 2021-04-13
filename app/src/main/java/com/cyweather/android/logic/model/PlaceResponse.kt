package com.cyweather.android.logic.model

import com.google.gson.annotations.SerializedName


/**
 * 描述：query cities data
 * @author Admin
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)