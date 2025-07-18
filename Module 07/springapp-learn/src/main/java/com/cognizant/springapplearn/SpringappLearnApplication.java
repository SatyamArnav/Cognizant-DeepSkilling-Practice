package com.cognizant.springapplearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ImportResource("classpath:country.xml")
@SpringBootApplication
@EnableJpaRepositories("com.cognizant.springapplearn.repository")

public class SpringappLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringappLearnApplication.class, args);
    }
}

