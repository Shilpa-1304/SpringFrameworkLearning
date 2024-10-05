package io.learning.LaunchApplication.implementation;

import io.learning.LaunchApplication.service.Course;

public class SpringBoot implements Course {
    private int price;
    public SpringBoot() {
        System.out.println("@Defalut spring boot constructor called.");
    }
    public SpringBoot(int price){
        System.out.println("@Constructor injection with parameterised constructor in spring boot constructor called.");
        this.price=price;
    }

    @Override
    public int getCoursePrice() {
        return this.price;
    }
}
