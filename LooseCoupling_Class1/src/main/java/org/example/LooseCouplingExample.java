package org.example;

import org.example.service.Course;

public class LooseCouplingExample {
    private Course course;

    public void setCourse(Course course) { //Course course =new Java();
        this.course = course;
    }
    public int buyCourse(Course course){
        return course.getCoursePrice();
    }
}
