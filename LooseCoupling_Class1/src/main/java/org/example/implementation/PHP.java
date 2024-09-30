package org.example.implementation;

import org.example.service.Course;

public class PHP implements Course {
    @Override
    public int getCoursePrice() {
        return 100;
    }
}
