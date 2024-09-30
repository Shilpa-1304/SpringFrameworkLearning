package org.example.implementation;

import org.example.service.Course;

public class Java implements Course {

    @Override
    public int getCoursePrice() {
        return 200;
    }
}
