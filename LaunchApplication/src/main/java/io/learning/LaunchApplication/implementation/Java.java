package io.learning.LaunchApplication.implementation;


import io.learning.LaunchApplication.service.Course;

public class Java implements Course {
    private int price;
    public Java() {
        System.out.println("Java Bean Created");
    }
    public void setPrice(int price){
        this.price=price;
    }
    @Override
    public int getCoursePrice() {
        return this.price;
    }

}
