package com.TwoConfigFile.TwoConfigFile;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommerceStudent implements Student{
    @Override
    public void getStudentType() {
        System.out.println("I am Commerce Student");
    }
}
