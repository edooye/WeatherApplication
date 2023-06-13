package com.example.weatheraplication

import com.google.gson.annotations.SerializedName

data class ResponseWeather(

	@field:SerializedName("queryCost")
	val queryCost: Int? = null,

	@field:SerializedName("alerts")
	val alerts: List<Any?>? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("currentConditions")
	val currentConditions: CurrentConditions? = null,

	@field:SerializedName("timezone")
	val timezone: String? = null,

	@field:SerializedName("latitude")
	val latitude: Any? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("days")
	val days: List<DaysItem?>? = null,

	@field:SerializedName("stations")
	val stations: Stations? = null,

	@field:SerializedName("tzoffset")
	val tzoffset: Int? = null,

	@field:SerializedName("longitude")
	val longitude: Any? = null,

	@field:SerializedName("resolvedAddress")
	val resolvedAddress: String? = null
)

data class CurrentConditions(

	@field:SerializedName("uvindex")
	val uvindex: Int? = null,

	@field:SerializedName("sunrise")
	val sunrise: String? = null,

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("preciptype")
	val preciptype: Any? = null,

	@field:SerializedName("sunriseEpoch")
	val sunriseEpoch: Int? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("cloudcover")
	val cloudcover: Any? = null,

	@field:SerializedName("datetime")
	val datetime: String? = null,

	@field:SerializedName("precip")
	val precip: Any? = null,

	@field:SerializedName("solarradiation")
	val solarradiation: Int? = null,

	@field:SerializedName("datetimeEpoch")
	val datetimeEpoch: Int? = null,

	@field:SerializedName("windgust")
	val windgust: Any? = null,

	@field:SerializedName("dew")
	val dew: Any? = null,

	@field:SerializedName("humidity")
	val humidity: Any? = null,

	@field:SerializedName("precipprob")
	val precipprob: Int? = null,

	@field:SerializedName("temp")
	val temp: Any? = null,

	@field:SerializedName("visibility")
	val visibility: Any? = null,

	@field:SerializedName("feelslike")
	val feelslike: Any? = null,

	@field:SerializedName("winddir")
	val winddir: Int? = null,

	@field:SerializedName("pressure")
	val pressure: Int? = null,

	@field:SerializedName("solarenergy")
	val solarenergy: Int? = null,

	@field:SerializedName("stations")
	val stations: List<String?>? = null,

	@field:SerializedName("moonphase")
	val moonphase: Any? = null,

	@field:SerializedName("snowdepth")
	val snowdepth: Int? = null,

	@field:SerializedName("snow")
	val snow: Int? = null,

	@field:SerializedName("sunset")
	val sunset: String? = null,

	@field:SerializedName("sunsetEpoch")
	val sunsetEpoch: Int? = null,

	@field:SerializedName("windspeed")
	val windspeed: Any? = null,

	@field:SerializedName("conditions")
	val conditions: String? = null
)

data class WIHH(

	@field:SerializedName("contribution")
	val contribution: Int? = null,

	@field:SerializedName("distance")
	val distance: Int? = null,

	@field:SerializedName("latitude")
	val latitude: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("useCount")
	val useCount: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("longitude")
	val longitude: Any? = null,

	@field:SerializedName("quality")
	val quality: Int? = null
)

data class WIII(

	@field:SerializedName("contribution")
	val contribution: Int? = null,

	@field:SerializedName("distance")
	val distance: Int? = null,

	@field:SerializedName("latitude")
	val latitude: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("useCount")
	val useCount: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("longitude")
	val longitude: Any? = null,

	@field:SerializedName("quality")
	val quality: Int? = null
)

data class YDDP2(

	@field:SerializedName("contribution")
	val contribution: Int? = null,

	@field:SerializedName("distance")
	val distance: Int? = null,

	@field:SerializedName("latitude")
	val latitude: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("useCount")
	val useCount: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("longitude")
	val longitude: Any? = null,

	@field:SerializedName("quality")
	val quality: Int? = null
)

data class DaysItem(

	@field:SerializedName("uvindex")
	val uvindex: Int? = null,

	@field:SerializedName("sunrise")
	val sunrise: String? = null,

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("preciptype")
	val preciptype: List<String?>? = null,

	@field:SerializedName("sunriseEpoch")
	val sunriseEpoch: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("feelslikemin")
	val feelslikemin: Any? = null,

	@field:SerializedName("cloudcover")
	val cloudcover: Any? = null,

	@field:SerializedName("datetime")
	val datetime: String? = null,

	@field:SerializedName("precip")
	val precip: Any? = null,

	@field:SerializedName("solarradiation")
	val solarradiation: Any? = null,

	@field:SerializedName("datetimeEpoch")
	val datetimeEpoch: Int? = null,

	@field:SerializedName("windgust")
	val windgust: Any? = null,

	@field:SerializedName("dew")
	val dew: Any? = null,

	@field:SerializedName("humidity")
	val humidity: Any? = null,

	@field:SerializedName("precipprob")
	val precipprob: Int? = null,

	@field:SerializedName("precipcover")
	val precipcover: Any? = null,

	@field:SerializedName("tempmin")
	val tempmin: Any? = null,

	@field:SerializedName("temp")
	val temp: Any? = null,

	@field:SerializedName("hours")
	val hours: List<HoursItem?>? = null,

	@field:SerializedName("feelslikemax")
	val feelslikemax: Any? = null,

	@field:SerializedName("visibility")
	val visibility: Any? = null,

	@field:SerializedName("feelslike")
	val feelslike: Any? = null,

	@field:SerializedName("severerisk")
	val severerisk: Int? = null,

	@field:SerializedName("winddir")
	val winddir: Any? = null,

	@field:SerializedName("pressure")
	val pressure: Any? = null,

	@field:SerializedName("solarenergy")
	val solarenergy: Any? = null,

	@field:SerializedName("stations")
	val stations: List<String?>? = null,

	@field:SerializedName("tempmax")
	val tempmax: Any? = null,

	@field:SerializedName("moonphase")
	val moonphase: Any? = null,

	@field:SerializedName("snowdepth")
	val snowdepth: Int? = null,

	@field:SerializedName("snow")
	val snow: Int? = null,

	@field:SerializedName("sunset")
	val sunset: String? = null,

	@field:SerializedName("sunsetEpoch")
	val sunsetEpoch: Int? = null,

	@field:SerializedName("windspeed")
	val windspeed: Any? = null,

	@field:SerializedName("conditions")
	val conditions: String? = null
)

data class HoursItem(

	@field:SerializedName("uvindex")
	val uvindex: Int? = null,

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("preciptype")
	val preciptype: Any? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("cloudcover")
	val cloudcover: Int? = null,

	@field:SerializedName("datetime")
	val datetime: String? = null,

	@field:SerializedName("precip")
	val precip: Int? = null,

	@field:SerializedName("solarradiation")
	val solarradiation: Int? = null,

	@field:SerializedName("datetimeEpoch")
	val datetimeEpoch: Int? = null,

	@field:SerializedName("windgust")
	val windgust: Any? = null,

	@field:SerializedName("dew")
	val dew: Any? = null,

	@field:SerializedName("humidity")
	val humidity: Any? = null,

	@field:SerializedName("precipprob")
	val precipprob: Int? = null,

	@field:SerializedName("temp")
	val temp: Int? = null,

	@field:SerializedName("visibility")
	val visibility: Any? = null,

	@field:SerializedName("feelslike")
	val feelslike: Int? = null,

	@field:SerializedName("severerisk")
	val severerisk: Int? = null,

	@field:SerializedName("winddir")
	val winddir: Int? = null,

	@field:SerializedName("pressure")
	val pressure: Int? = null,

	@field:SerializedName("solarenergy")
	val solarenergy: Any? = null,

	@field:SerializedName("stations")
	val stations: List<String?>? = null,

	@field:SerializedName("snowdepth")
	val snowdepth: Int? = null,

	@field:SerializedName("snow")
	val snow: Int? = null,

	@field:SerializedName("windspeed")
	val windspeed: Any? = null,

	@field:SerializedName("conditions")
	val conditions: String? = null
)

data class Stations(

	@field:SerializedName("WIII")
	val wIII: WIII? = null,

	@field:SerializedName("WIHH")
	val wIHH: WIHH? = null,

	@field:SerializedName("YDDP2")
	val yDDP2: YDDP2? = null
)
