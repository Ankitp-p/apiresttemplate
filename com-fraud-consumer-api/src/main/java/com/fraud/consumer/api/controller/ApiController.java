package com.fraud.consumer.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/myapp")
public class ApiController {

	@Autowired
	private RestTemplate restTemplate;
	
	private static String url="https://restcountries.eu/rest/v2/all";
	
	@GetMapping("/countries")
	public List<Object> getCountries(){
		Object[] countries =restTemplate.getForObject(url, Object[].class);
     return Arrays.asList(countries);
	}
	
}
