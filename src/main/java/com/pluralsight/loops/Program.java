package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
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

        System.out.println("Please enter a name to search by: ");
        String name = myscanner.nextLine();
        int averageAge = 0, oldestAge = Integer.MIN_VALUE, youngestAge = Integer.MAX_VALUE;
        List<Person> peopleMatch = new ArrayList<>();
        for (Person person : people) {
            if (people.equals(name)) {
                peopleMatch.add(person);
                System.out.println(peopleMatch);
            }
            averageAge += person.getAge();
            oldestAge = Math.max(oldestAge, person.getAge());
            youngestAge = Math.min(youngestAge, person.getAge());

        }
        averageAge = averageAge / 10;
        System.out.println("Average age is " + averageAge);
        System.out.println("Oldest age is " + oldestAge);
        System.out.println("Youngest age is " + youngestAge);
    }
}
