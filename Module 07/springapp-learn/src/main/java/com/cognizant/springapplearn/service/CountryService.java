package com.cognizant.springapplearn.service;

import java.util.List;

import com.cognizant.springapplearn.model.Country;
import com.cognizant.springapplearn.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    @SuppressWarnings("unchecked")
    public Country getCountry(String code) {
        List<Country> countryList = (List<Country>) context.getBean("countryList");
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new CountryNotFoundException("Country not found"));
    }
}
