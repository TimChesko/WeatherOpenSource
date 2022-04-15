package com.example.weatheropensource.repository


class RepositoryImpl: Repository {
    override fun getWeatherFromServer(): Weather = Weather()
    override fun getWorldWeatherFromLocalStorage():List<Weather> = getWorldCities()
    override fun getRussianWeatherFromLocalStorage():List<Weather> = getRussianCities()
}