package jdk8.streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFeatures {
    public static void main(String[] args) {
        // count empty string
        List<String> stringList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long emptyStringCount = stringList.stream().filter(String::isEmpty).count();
        System.out.println(emptyStringCount);
        // Count String whose length is more than three
        long countStringLengthMoreThanThree = stringList.stream().filter(x -> (x.length() > 3)).count();
        System.out.println(countStringLengthMoreThanThree);
        // Count number of String which starts with "a"
        long countStringStartsWithA = stringList.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(countStringStartsWithA);
        // Remove all empty Strings from List
        List<String> nonEmptyStringList = stringList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println(nonEmptyStringList);
        // Create a List with String more than 2 characters
        List<String> stringListWithLengthTwo = stringList.stream().filter(x -> x.length()>2).collect(Collectors.toList());
        System.out.println(stringListWithLengthTwo);
        // Convert String to uppercase and Join them with coma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7CountriesWithCaps = G7.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        List<String> ListG7CountriesWithCaps = G7.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(G7CountriesWithCaps);
        System.out.println(ListG7CountriesWithCaps);
        // Important point
        /*If you are using a lambda expression as an anonymous function but not doing anything with
        the argument passed, you can replace lambda expression with method reference*/

        // x -> x.isEmpty() can be replaced by String::isEmpty
        // x -> x.toUpperCase() can be replaced by String::toUpperCase

        // Create a List of the square of all distinct numbers
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distictNumbers = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(distictNumbers);
        // Get count, min, max, sum, and the average for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats);
    }
}