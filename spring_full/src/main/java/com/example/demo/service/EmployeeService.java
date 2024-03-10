package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {
        return employeeRepository.getEmployees();
    }
    @Override
    public void insertEmployee(Employee employee) {
        employeeRepository.insertEmployee(employee);
    }
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.getEmployeeById(id);
    }
}
