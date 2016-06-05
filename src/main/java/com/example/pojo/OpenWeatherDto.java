package com.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class OpenWeatherDto {

	private int id;
	private String name;
	private int cod;
	private MainDto main;

	private List<WeatherInfo> weather = new ArrayList<WeatherInfo>();
	private String dt;

	private WindDto wind;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public MainDto getMain() {
		return main;
	}

	public void setMain(MainDto main) {
		this.main = main;
	}

	public List<WeatherInfo> getWeather() {
		return weather;
	}

	public void setWeather(List<WeatherInfo> weather) {
		this.weather = weather;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public WindDto getWind() {
		return wind;
	}

	public void setWind(WindDto wind) {
		this.wind = wind;
	}

}
