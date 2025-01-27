package com.example.weatherapp.api

import com.example.weatherapp.api.WeatherModel
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.weatherapp.api.WeatherModel as WeatherModel1

interface WeatherApi {

    @GET("/v1/current.json")
    suspend fun getWeather(
        @Query("key") apiKey: String,
        @Query("q") city: String
    ) : Response<WeatherModel>


}