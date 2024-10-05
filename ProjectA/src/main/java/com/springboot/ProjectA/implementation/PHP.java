package com.springboot.ProjectA.implementation;

import com.springboot.ProjectA.service.Course;
import org.springframework.stereotype.Service;

@Service
public class PHP implements Course {
    @Override
    public int getCoursePrice() {
        return 100;
    }
}
