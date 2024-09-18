package com.serenitydojo;

import  org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        Cat Felix = new Cat("Felix", "Omakase", 3);
        Cat Mojo = new Cat("Mojo", "Sashimi", 4);
        Cat Chma = new Cat("Chma", "KFC", 2);

        Chma.setPrice(168);

        System.out.println(Mojo.ageInTwoYears());

        System.out.println(Felix.getCatDetails());
        System.out.println(Mojo.getCatDetails());
        System.out.println("The price of this Chma is $"+ Chma.returnPrice() +".");

    }


    @Test
    public void creating_a_dog() {

        Dog Chkea = new Dog("Sony", 8, "Husky", 8.2d, "$150");

        System.out.println(Chkea.ageInTwoYears());

    }


    @Test
    public void catMakesNoise() {
        Cat felix = new Cat("Felix", "Omakase", 23);
        felix.makeNoise();
        System.out.println(felix.loudScream());
        felix.feed("Omakase");
        felix.groom();

    }


}
