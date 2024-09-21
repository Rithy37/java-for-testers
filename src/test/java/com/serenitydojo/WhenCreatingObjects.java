package com.serenitydojo;

import  org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        Cat Felix = new Cat("Felix", "Omakase", 3);
        Cat Mojo = new Cat("Mojo", "Sashimi", 4);
        Cat Matcha = new Cat("Matcha", "KFC", 2);

        Matcha.setPrice(168);

        System.out.println(Mojo.ageInTwoYears());

        System.out.println(Felix.getCatDetails());
        System.out.println(Mojo.getCatDetails());
        System.out.println("The price of this Matcha is $"+ Matcha.returnPrice() +".");

    }


    @Test
    public void creating_a_dog() {

        Dog Chkea = new Dog("Sony", 8, "Husky");
        System.out.println(Chkea.ageInTwoYears());

    }

    @Test
    public void createAHamster(){
        Hamster Jerry = new Hamster("Jerry", 2,"play ground");
        System.out.println(Jerry.ageInTwoYears());
        System.out.println(Jerry.getFavouriteGame());

    }


    @Test
    public void catMakesNoise() {
        Cat felix = new Cat("Felix", "Omakase", 3);
        System.out.println("Felix goes " + felix.makeNoise());
        felix.feed("Omakase");
        felix.groom();
    }


    @Test
    public void dog_make_noise(){
        Dog fido = new Dog("Fido", 2,"Husky");
        System.out.println("Fido goes " + fido.makeNoise());

    }

    @Test
    public void pets_make_noise() {
        Pet felix = new Cat("Felix", "Omakase", 3);
        Pet fido = new Dog("Fido", 2, "Husky");
        Pet jerry = new Hamster("Jerry", 1, "play ground");

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Jerry goes " + jerry.makeNoise());

    }


}
