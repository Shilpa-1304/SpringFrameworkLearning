package io.learning.LaunchApplication.Main;

public class Employee {
    private int id;
    private String name;
    private String city;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Employee() {
        System.out.println("Default constructor called, Bean created");
    }

    public Employee(int id, String name, String city) {
        System.out.println("Parameterised constructor called, Bean created");
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
