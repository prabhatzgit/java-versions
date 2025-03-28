package jdk8.comparator.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

}
