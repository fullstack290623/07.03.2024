package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @GetMapping
    public List<Employee> get()
    {
        return employeeService.getAllEmployees();
    }
    @PostMapping
    public ResponseEntity<Employee> post(@RequestBody Employee employee) {
        employeeService.insertEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @GetMapping(value ="/{id}")
    public ResponseEntity getById(@PathVariable Integer id) {
        Employee e = employeeService.getEmployeeById(id);
        if (e != null) {
            return new ResponseEntity<Employee>(e, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("{ \"Warning\": \"not found employee with Id " + id + "\" }",HttpStatus.NOT_FOUND);
        }
    }
}
