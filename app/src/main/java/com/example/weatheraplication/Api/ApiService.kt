package com.example.weatheraplication.Api

import com.example.weatheraplication.ResponseWeather
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("Jakarta?unitGroup=metric&key=F3XK4SZ7W8TB3MC9UP5WD98J8&contentType=json")
    fun getWeather() : Call<ResponseWeather>
}