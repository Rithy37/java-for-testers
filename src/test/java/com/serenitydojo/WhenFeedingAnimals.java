package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.serenitydojo.model.AnimalType.CAT;
import static com.serenitydojo.model.AnimalType.DOG;
import static com.serenitydojo.model.AnimalType.HAMSTER;


public class WhenFeedingAnimals {

    @Test
    public void shouldFeedCatsCatFood(){

        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, false);
        System.out.println(food);
        Assert.assertEquals("Tuna", food);

    }

    @Test
    public void shouldFeedDogsDogFood(){

        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, false);
        System.out.println(food);
        Assert.assertEquals("Normal Meat", food);

    }

    @Test
    public void shouldFeedHamstersHamsterFood(){

        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER, false);
        System.out.println(food);
        Assert.assertEquals("Cabbage", food);

    }

    @Test
    public void shouldFeedCatsPremiumFood(){

        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, true);
        System.out.println(food);
        Assert.assertEquals("Salmon", food);

    }

    @Test
    public void shouldFeedDogsPremiumFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, true);
        System.out.println(food);
        Assert.assertEquals("Wagyu Beef", food);
    }

    @Test
    public void shouldFeedHamstersPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER, true);
        System.out.println(food);
        Assert.assertEquals("Lettuce", food);
    }

    @Test
    public void listOfColours(){

        String[] colour = {"red", "blue", "green", "white"};
        int[] age = {27, 23, 89};

        String[] moreColours = new String[4];
        moreColours[0] = "yellow";
        moreColours[1] = "black";
        moreColours[2] = "pink";

        for( int i = 0; i < 3; i++){
            System.out.println(moreColours[i]);
        }

        Set<String> myCars = new HashSet<>();

        myCars.add("Land Rover Defender");
        myCars.add("Range Rover Velar");
        myCars.add("Mercedes S 450");
        myCars.add("Land Rover Defender");

        for (String dreamCars : myCars) {
            System.out.println("Dream Cars : " + dreamCars);
        }

    }
}
