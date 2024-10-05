package io.learning.LaunchApplication.implementation;

import io.learning.LaunchApplication.service.Course;

public class PHP implements Course {
    @Override
    public int getCoursePrice() {
        return 100;
    }
}
