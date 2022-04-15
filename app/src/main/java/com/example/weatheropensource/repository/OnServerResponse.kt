package com.example.weatheropensource.repository

import com.example.weatheropensource.repository.DTO.WeatherDTO

fun interface OnServerResponse {
    fun onResponse(weatherDTO: WeatherDTO)
}