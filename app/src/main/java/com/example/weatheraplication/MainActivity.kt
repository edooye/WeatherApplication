package com.example.weatheraplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.weatheraplication.Api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiConfig.getService().getWeather().enqueue(object : Callback<ResponseWeather> {
            override fun onResponse(
                call: Call<ResponseWeather>,
                response: Response<ResponseWeather>
            ) {
                if (response.isSuccessful) {
                    val responseWeather = response.body()
                    val dataWeather = responseWeather?.address
                    val dataConditions = responseWeather?.currentConditions

                    val weatherAdapter = WeatherAdapter(dataWeather, dataConditions)
                    val weatherText = buildWeatherText(weatherAdapter)
                    weather.text = weatherText
                } else {
                    Toast.makeText(applicationContext, "Failed to fetch weather data", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ResponseWeather>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun buildWeatherText(adapter: WeatherAdapter): String {
        val stringBuilder = StringBuilder()
        for (i in 0 until adapter.itemCount) {
            val currentConditions = adapter.getItem(i)
            currentConditions?.let {
                val city = it.city
                val date = it.date
                val temp = it.temperature

                stringBuilder.append("City: $city\n")
                stringBuilder.append("Date: $date\n")
                stringBuilder.append("Temperature: $temp\n\n")
            }
        }
        return stringBuilder.toString()
    }
}
