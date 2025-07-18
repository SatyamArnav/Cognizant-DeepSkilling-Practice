package com.cognizant.springapplearn.controller;

import com.cognizant.springapplearn.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.springapplearn.service.CountryService;
import com.cognizant.springapplearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    @Autowired
    private CountryService countryService;
    @Autowired
    private ApplicationContext context;
   // @RequestMapping("/country")
    //public Country getCountryIndia() {
   //    LOGGER.info("START - getCountryIndia()");
   //   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    //   Country country = (Country) context.getBean("country");
    //   LOGGER.info("END - getCountryIndia()");
    //    return country;
   // }
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START - getAllCountries()");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = context.getBean("countryList", List.class);

        LOGGER.info("END - getAllCountries()");
        return countryList;
    }
    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        return countryService.getCountry(code);
    }
    @GetMapping("/country")
    public Country getCountryIndia() {
        return (Country) context.getBean("in");
    }



}
