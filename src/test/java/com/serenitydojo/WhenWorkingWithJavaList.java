package com.serenitydojo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class WhenWorkingWithJavaList {

    @Test
    public void creatingASimpleList() {
        List simpleList = new ArrayList();
        simpleList.add("test value");
        simpleList.add(123);

        assertThat(simpleList).contains("test value", 123);
    }

    @Test
    public void createATypedList(){
        List<String> names = new ArrayList<>();
        List<Integer> ages = Arrays.asList(28,25,30);

        names.add("Messi");
        names.add("Lamine");
        names.add("Gavi");

        assertThat(names).contains("Messi", "Lamine", "Gavi");
        assertThat(ages).contains(28,30,25);
    }

    @Test
    public void removingStuff() {
        List<String> names = new ArrayList<>();

        names.add("Messi");
        names.add("Lamine");
        names.add("Gavi");

        names.remove("Lamine");

        assertThat(names).contains("Messi","Gavi");
    }

    @Test
    public void findElementInAList() {
        List<Integer> ages = Arrays.asList(28,25,30);

        int indexOf25 = ages.indexOf(25);

        System.out.println(indexOf25);

    }

}
