package com.learning.spring_jdbc.service;

import com.learning.spring_jdbc.dao.EmployeeDao;
import com.learning.spring_jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDao repo;
    @Override
    public List<Employee> getEmployees() {
        List<Employee> list=repo.getEmployeesDetails();
        return list;
    }
}
