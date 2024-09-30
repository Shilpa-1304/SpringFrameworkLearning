package org.example.implementation;

import org.example.service.Course;

public class Kotlin implements Course {
    @Override
    public int getCoursePrice() {
        return 500;
    }
}
