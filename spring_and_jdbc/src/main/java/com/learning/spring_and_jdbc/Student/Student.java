package com.learning.spring_and_jdbc.Student;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {
//  BEAN LIFE CYCLE:   static block->instance block->constructor->post constructor->method call ->pre destroy
    static{
        System.out.println("Student static block");
    }
    {
        System.out.println("Student instance block");
    }
    Student(){
        System.out.println("Student constructor block");
    }
    @PostConstruct
    public void anyMethodName(){
        System.out.println("Student Bean after construction");
    }
    public void getStudent(){
        System.out.println("Student method block called");
    }
    @PreDestroy
    public void destroyBean(){
        System.out.println("Student Bean before destroying");
    }
}
