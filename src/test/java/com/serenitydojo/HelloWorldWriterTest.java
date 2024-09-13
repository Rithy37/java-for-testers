package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
                writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {
        int ageThisYear = 27;
        int ageNextYear = ageThisYear + 1;
        System.out.println("Next year I will turn " + ageNextYear + " years old");

        long moneyInMyBankAccount = 20000000000000000L;
        double myHeight = 169.8;
        System.out.println("This is how much money I will have in my bank account $" + moneyInMyBankAccount);
    }

    @Test
    public void workingWithStrings() {
        String firstName = "Rithy";
        String lastName = "Mech";
        String upperCase = lastName.toUpperCase();
        String lowerCase = firstName.toLowerCase();
        String replaceName = firstName.replace("R","Sopheakr");
        System.out.println(replaceName);
        System.out.println("My last name in uppercase is: " + upperCase + " and my first name in lowercase is: " + lowerCase);

    }

}
