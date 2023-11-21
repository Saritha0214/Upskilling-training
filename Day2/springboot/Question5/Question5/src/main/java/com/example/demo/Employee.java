package com.example.demo;

import org.springframework.data.annotation.Id;

public class Employee {
    @Id
    private String employeeId;
    private String employeeName;
    private String employeeDepartment;
    private String employeeSalary;
    public String getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }
    public String getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }
    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public Employee(String employeeId, String employeeName, String employeeDepartment, String employeeSalary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeSalary = employeeSalary;
    }


 

}