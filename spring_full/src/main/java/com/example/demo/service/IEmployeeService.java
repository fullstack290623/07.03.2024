package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    void insertEmployee(Employee employee);
}
