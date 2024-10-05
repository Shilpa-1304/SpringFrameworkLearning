package io.learning.LaunchApplication.implementation;


import io.learning.LaunchApplication.service.Course;

public class Kotlin implements Course {
    @Override
    public int getCoursePrice() {
        return 500;
    }
}
