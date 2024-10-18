package com.learning.spring_jdbc.dao;

import com.learning.spring_jdbc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {
    @Autowired
    private JdbcTemplate template;

    public void createTable(){
        template.update("CREATE TABLE Employee (\n" +
                "    id INT PRIMARY KEY,\n" +
                "    name VARCHAR(255),\n" +
                "    department VARCHAR(255)\n" +
                ")");
        System.out.println("Table created");
    }
    public void updateTable(Employee emp){
        System.out.println("Table updation started");
        template.update("INSERT INTO Employee (id, name, department) VALUES (?,?,?)",emp.getId(),emp.getName(),emp.getDepartment());
        System.out.println("Table updation ended");
    }
    public List<Employee> getEmployeesDetails(){

        return null;
    }
}
