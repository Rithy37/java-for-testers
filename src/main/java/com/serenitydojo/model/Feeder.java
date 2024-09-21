package com.serenitydojo.model;

public class Feeder {

    public String feeds(AnimalType animal, boolean isPremium) {
        switch (animal) {
            case CAT:
                return (isPremium) ? "Salmon" : "Tuna";
            case DOG:
                return (isPremium) ? "Wagyu Beef" : "Normal Meat";
            case HAMSTER:
                return (isPremium) ? "Lettuce" : "Cabbage";
            default:
                return "Unknown Animal";
        }

    }
}
