package com.cognizant.employeeservice.controller;

import com.cognizant.employeeservice.dao.EmployeeDao;
import com.cognizant.employeeservice.model.Employee;
import com.cognizant.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees(); // call to service, not DAO directly
    }
}
