package com.learning.spring_and_jdbc.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeService{
    @Autowired
    EmployeePersistenceLayer daoLayer;
    @Override
    public List<Employee> getEmployeeDetail() {
        System.out.println("Employe details provided");
        List<Employee> employees=daoLayer.getEmployees();
        return employees;
    }
}
