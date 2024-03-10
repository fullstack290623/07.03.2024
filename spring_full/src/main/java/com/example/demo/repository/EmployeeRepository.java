package com.example.demo.repository;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired private CacheRepositoryImpl cacheRepositoryimpl;
    public List<Employee> getEmployees() {

        String query = "Select * from company";
        return jdbcTemplate.query(query, new EmployeeMapper());
    }
    public void insertEmployee(Employee employee) {
        String query = "INSERT INTO company(name, age, address, salary) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(query, employee.getName(), employee.getAge(),
                employee.getAddress(), employee.getSalary());
    }
    public Employee getEmployeeById(Integer id) {
        if (cacheRepositoryimpl.isKeyExist(String.valueOf(id))) {
            System.out.println("Bring in from cache");
            return null;
        }
        String query = "Select * from company where id =?";
        try
        {
            return jdbcTemplate.queryForObject(query, new EmployeeMapper(), id);
        }
        catch (EmptyResultDataAccessException e) {
            cacheRepositoryimpl.createCacheEntity(String.valueOf(id), "null");
            return null;
        }

    }
}
