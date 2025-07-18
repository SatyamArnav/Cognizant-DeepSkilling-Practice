package com.cognizant.springapplearn.config;

import com.cognizant.springapplearn.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CountryConfig {

    @Bean
    public Country in() {
        Country country = new Country();
        country.setCode("IN");
        country.setName("India");
        return country;
    }

    @Bean
    public Country us() {
        Country country = new Country();
        country.setCode("US");
        country.setName("United States");
        return country;
    }

    @Bean
    public Country jp() {
        Country country = new Country();
        country.setCode("JP");
        country.setName("Japan");
        return country;
    }

    @Bean
    public List<Country> countryList() {
        List<Country> list = new ArrayList<>();
        list.add(in());
        list.add(us());
        list.add(jp());
        return list;
    }
}
