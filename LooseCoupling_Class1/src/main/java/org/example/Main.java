package org.example;

import org.example.implementation.Java;
import org.example.service.Course;

public class Main {
    public static void main(String[] args) {
        LooseCouplingExample example=new LooseCouplingExample(); // Target Class
        System.out.println("Hi Universe, Let's learn Loose Coupling !");

        int price=example.buyCourse(new Java());
        // here new Java() is dependent object
        //and injecting the dependent object in Target class is dependency injection
        System.out.println("Price is "+price);
    }
}