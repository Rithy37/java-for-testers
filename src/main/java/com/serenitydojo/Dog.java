package com.serenitydojo;

public class Dog extends Pet{
    private String breed;

    public static final String DOG_NOISE = "Woof!";

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

    }

    public String getBreed(){
        return breed;
    }


    public String makeNoise() {
        return DOG_NOISE;

    }
}
