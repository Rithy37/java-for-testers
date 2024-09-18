package com.serenitydojo;

public class Dog extends Pet{
    private String breed;
    private Double weight;
    private String price;

    public Dog(String name, int age, String breed, Double weight, String price) {
        super(name, age);
        this.breed = breed;
        this.price = price;
        this.weight = weight;
    }

    public String getPrice(){
        return price;
    }

    public Double getWeight() {
        return weight;
    }

    public String getBreed(){
        return breed;
    }



}
