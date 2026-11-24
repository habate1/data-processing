package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("John", "Smith", 25),
                new Person("Sarah", "Johnson", 32),
                new Person("Michael", "Williams", 18),
                new Person("Emily", "Brown", 45),
                new Person("David", "Jones", 29),
                new Person("Jessica", "Garcia", 21),
                new Person("James", "Miller", 55),
                new Person("Ashley", "Davis", 37),
                new Person("Robert", "Wilson", 16),
                new Person("Amanda", "Taylor", 42)
        ));
    }
}
