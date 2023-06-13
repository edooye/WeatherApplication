package com.example.weatheraplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WeatherAdapter(private val dataWeather: List<ResponseWeather?>?, private val dataWeathers: List<CurrentConditions?>?) : RecyclerView.Adapter<WeatherAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val city: TextView = view.findViewById(R.id.tvCity)
        val date: TextView = view.findViewById(R.id.tvDate)
        val temp: TextView = view.findViewById(R.id.tvTemp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val weatherData = dataWeather?.get(position)
        val conditionsData = dataWeathers?.get(position)

        holder.city.text = weatherData?.address
        holder.date.text = conditionsData?.datetime
        holder.temp.text = conditionsData?.temp.toString()
    }

    override fun getItemCount(): Int {
        return dataWeather?.size ?: 0
    }

    fun getItem(i: Int) {

    }
}
