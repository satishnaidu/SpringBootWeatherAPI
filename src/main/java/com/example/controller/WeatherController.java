package com.example.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.pojo.MainDto;
import com.example.pojo.OpenWeatherDto;
import com.example.pojo.WeatherDto;
import com.example.pojo.WeatherInfo;

@RestController
public class WeatherController {

	private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);

	@RequestMapping("/weather")
	public WeatherDto getWeatherInfo(@RequestParam(name = "city") String city) {

		String url = "http://api.openweathermap.org/data/2.5/weather?q=Melbourne,%20AU&appid=b77cf6380659c5a11b64962671ef3385";

		RestTemplate restTemplate = new RestTemplate();
		OpenWeatherDto openWeatherDto = restTemplate.getForObject(url, OpenWeatherDto.class);

		System.out.println(openWeatherDto);

		WeatherDto weatherDto = new WeatherDto();
		weatherDto.setCity(openWeatherDto.getName());
		MainDto mainDto = openWeatherDto.getMain();
		weatherDto.setTemperature(mainDto.getTemp());
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE dd a");
		LocalDateTime localDateTime = LocalDateTime.now();
		String updatedTime = dateTimeFormatter.format(localDateTime);
		weatherDto.setUpdatedTime(updatedTime);
		List<WeatherInfo> weatherInfos = openWeatherDto.getWeather();
		if (!weatherInfos.isEmpty()) {
			weatherDto.setWeatherDesc(weatherInfos.get(0).getMain());
		}
		weatherDto.setWind(openWeatherDto.getWind().getSpeed());
		logger.info(weatherDto.toString());

		return weatherDto;
	}

}
