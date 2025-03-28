package jdk8.customobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Ivan", "Vasya", "Petr"));
        persons.add(new Person(2, "Ivan", "Vasya", "Petr"));
        persons.add(new Person(3, "Ivan", "Vasya", "Petr"));
        persons.add(new Person(4, "Ivan", "Gupta", "Ivan"));
        persons.add(new Person(5, "Petr", "Gupta", "Igor"));

        //Unique collection by combination first-second-last names
        persons
                .stream()
                .map(person -> person.firstName + " \t" + person.secondName + " \t" + person.lastName)
                .distinct().forEach(System.out::println);

        List<String> namesStartingWithSpecificChar = persons
                .stream()
                .filter(person -> person.firstName.startsWith("I"))
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(namesStartingWithSpecificChar);
    }
}
