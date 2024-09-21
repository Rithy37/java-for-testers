package com.serenitydojo;

public class Cat extends Pet {
    private String favouriteFood;
    private int price;

    public static final String CAT_NOISE = "Meow!";

    public Cat(String name, String favouriteFood, int age) {
        super(name, age);
        this.favouriteFood = favouriteFood;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public String getCatDetails() {
        return "My cat is called " + getName() + ". Its favourite food is " + favouriteFood +
                " and it is " + getAge() +" years old!";
    }

    public int returnPrice() {
        return price;
    }

    public String makeNoise() {
        return CAT_NOISE;
    }

    public void feed(String food) {
        System.out.println(getName() + " likes to eat " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + " cleans fur!");
    }

    private void lickPaws() {
        System.out.println(getName() + " lick paws!");
    }

    public String loudScream() {
        return scream();
    }

    private String scream() {
        return getName() + " screams MEOWWWWWWW!";
    }


}
