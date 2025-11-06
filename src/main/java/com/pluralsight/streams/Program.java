package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("Maya", "Thompson", 28));
        person.add(new Person("Leo", "Ramirez", 34));
        person.add(new Person("Aisha", "Patel", 22));
        person.add(new Person("Marcus", "Nguyen", 41));
        person.add(new Person("Zoe", "Kim", 19));
        person.add(new Person("Joseph", "Brooks", 37));
        person.add(new Person("Clara", "Moreno", 26));
        person.add(new Person("Jamal", "Carter", 45));
        person.add(new Person("Lily", "Chen", 31));
        person.add(new Person("Andre", "Sullivan", 52));


        //prompt for user to enter a name to search for
        // display names that match


        // calculate the average age of the people in the list
        // use  to add ages
        //use count method to divide by

        person.stream()
                        .count()
        person.stream()
                .map(Person::getAge -> age + age)



        //Display the age of the oldest in the list


        //display the age of the youngest in the list


    }
}
