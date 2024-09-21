package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

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
}
