package com.TwoConfigFile.TwoConfigFile;

import org.springframework.stereotype.Component;

@Component
public class BiologyStudent implements Student{

    @Override
    public void getStudentType() {
        System.out.println("I am Biology Student");
    }
}
