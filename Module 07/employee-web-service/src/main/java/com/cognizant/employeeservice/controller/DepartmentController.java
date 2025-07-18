package com.cognizant.employeeservice.controller;

import com.cognizant.employeeservice.model.Department;
import com.cognizant.employeeservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        System.out.println("Department REST service called...");
        return departmentService.getAllDepartments();
    }
}
