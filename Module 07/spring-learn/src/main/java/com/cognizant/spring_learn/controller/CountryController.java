package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("US", "United States"));
        countries.add(new Country("DE", "Germany"));
        countries.add(new Country("IN", "India"));
        countries.add(new Country("JP", "Japan"));
        return countries;
    }
}


