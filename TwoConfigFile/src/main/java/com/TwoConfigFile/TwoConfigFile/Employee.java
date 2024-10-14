package com.TwoConfigFile.TwoConfigFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    public Employee() {
        System.out.println("Default constructor called,Employee Bean created");
    }

    @Autowired
    @Qualifier("biologyStudent")
    public void getStudentType(Student student){
        student.getStudentType();
    }

//    @Primary < @Qualifier
}
