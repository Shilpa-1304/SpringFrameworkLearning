package org.example.implementation;

import org.example.service.Course;

public class SpringBoot implements Course {
    @Override
    public int getCoursePrice() {
        return 1000;
    }
}
