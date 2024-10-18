package com.learning.spring_and_jdbc.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeePersistenceLayer {
    @Autowired
    private DataSource dataSource;
    List<Employee> employees;

    public List<Employee> getEmployees(){
        try {
            String sqlQuery="Select * from Employee";
            Connection connection=dataSource.getConnection();
            PreparedStatement statement=connection.prepareStatement(sqlQuery);
            ResultSet result=statement.executeQuery();
            employees=new ArrayList<>();
            while (result.next()){
                Employee employee=new Employee();

                employee.setId(result.getInt(1));
                employee.setName(result.getString(2));
                employee.setDepartment(result.getString(3));
                employees.add(employee);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}
