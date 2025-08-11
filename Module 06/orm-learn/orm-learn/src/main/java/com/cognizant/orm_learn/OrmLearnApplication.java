package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;
    private static CountryRepository countryRepository;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

        countryService = context.getBean(CountryService.class);
        countryRepository = context.getBean(CountryRepository.class);

        testSearchWithQueryAnnotation();
    }

    private static void testSearchWithQueryAnnotation() {
        LOGGER.info("Start: searchByPartialName");
        List<Country> results = countryRepository.searchByPartialName("ou");
        LOGGER.debug("Results: {}", results);
        LOGGER.info("End");

        LOGGER.info("Start: searchByPartialNameSorted");
        List<Country> sortedResults = countryRepository.searchByPartialNameSorted("ou");
        LOGGER.debug("Sorted Results: {}", sortedResults);
        LOGGER.info("End");

        LOGGER.info("Start: searchByStartingLetter");
        List<Country> startsWithZ = countryRepository.searchByStartingLetter("Z");
        LOGGER.debug("Starts with Z: {}", startsWithZ);
        LOGGER.info("End");
    }
}