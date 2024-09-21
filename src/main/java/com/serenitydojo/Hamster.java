package com.serenitydojo;

public class Hamster extends Pet{

    private String favouriteGame;

    public Hamster(String name, int age, String favouriteGame){
        super(name,age);
        this.favouriteGame = favouriteGame;
    }

    public String getFavouriteGame(){
        return favouriteGame;
    }

    @Override
    public String makeNoise(){
        return "Squeak!";
    }
}
