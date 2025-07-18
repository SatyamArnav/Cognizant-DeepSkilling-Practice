package com.cognizant.employeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:employeelist.xml")
public class EmployeeWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeWebServiceApplication.class, args);
    }
}
