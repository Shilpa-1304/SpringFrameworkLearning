package com.springboot.ProjectA.implementation;
import com.springboot.ProjectA.service.Course;
import org.springframework.stereotype.Service;

@Service
public class SpringBoot implements Course {
    @Override
    public int getCoursePrice() {
        return 1000;
    }
}
