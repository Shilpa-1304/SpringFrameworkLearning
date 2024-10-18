package com.learning.spring_jdbc.service;
import com.learning.spring_jdbc.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
}
