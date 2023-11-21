package com.example.demo;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/employee/{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable String employeeId){
        return employeeService.getEmployee(employeeId);
    }

 

}