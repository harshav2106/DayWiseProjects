package com.wipro.weatherappdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TemperatureController {
	@GetMapping("/tocentigrade/{fahrenheit}")
    public String convertToCentigrade(@PathVariable double fahrenheit) {
        double centigrade = (fahrenheit - 32) * 5 / 9;
        return fahrenheit + "°F is equal to " + String.format("%.2f", centigrade)+"°C";
        }
}
