package io.learning.LaunchApplication;

import io.learning.LaunchApplication.service.Course;

public class LooseCouplingExample {
    private Course course;

    public LooseCouplingExample() {
        System.out.println("@Default constructor: LooseCouplingExample Bean Created by xml file.");
    }
    public LooseCouplingExample(Course course) {
        System.out.println("@Parameterised constructor: LooseCouplingExample Bean Created by xml file.");
    }
    public void setCourse(Course course) { //Course course =new Java();
        this.course = course;
        System.out.println("@setter injection at course: "+ course.getClass());
    }
    public int buyCourse(Course course){
        return course.getCoursePrice();
    }
}
