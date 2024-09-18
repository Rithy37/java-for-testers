package com.serenitydojo;

public class Pet {
    private String name;
    private int age;

    public Pet (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return  age;
    }

    public double ageInTwoYears() {
        return age + 2;
    }



}
