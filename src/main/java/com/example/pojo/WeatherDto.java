package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDto {

	private String city;
	private String updatedTime;
	private String weatherDesc;
	private double temperature;
	private double wind;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getWeatherDesc() {
		return weatherDesc;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getWind() {
		return wind;
	}

	public void setWind(double wind) {
		this.wind = wind;
	}

	public void setWeatherDesc(String weatherDesc) {
		this.weatherDesc = weatherDesc;
	}

	@Override
	public String toString() {
		return "WeatherDto [city=" + city + ", updatedTime=" + updatedTime + ", weatherDesc=" + weatherDesc
				+ ", temperature=" + temperature + ", wind=" + wind + "]";
	}

}
