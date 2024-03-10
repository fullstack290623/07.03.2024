package com.example.demo.model;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("address").trim(),
                rs.getFloat("salary"));
    }
}
