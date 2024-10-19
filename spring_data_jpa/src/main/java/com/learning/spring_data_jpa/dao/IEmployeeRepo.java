package com.learning.spring_data_jpa.dao;

import com.learning.spring_data_jpa.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//It's optional to write @Repository
@Repository
public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {
}
