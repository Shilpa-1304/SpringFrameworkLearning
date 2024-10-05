package com.springboot.ProjectA;

import com.springboot.ProjectA.service.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class LooseCouplingExample {
    @Autowired
    private Course course;

    public void setCourse(Course course) { //Course course =new Java();
        this.course = course;
    }
    public int buyCourse(Course course){
        return course.getCoursePrice();
    }
}
