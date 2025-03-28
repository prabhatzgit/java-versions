package jdk8.duplicate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateOfListOrStream {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<String>();
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple");

        System.out.println("Find duplicates by using distinct() method");

        List<String> uniqueElements = companies
                .stream()
                .distinct()
                .collect(Collectors.toList());

        for (String company : uniqueElements) {
            companies.remove(company);
        }

        companies.forEach(System.out::println);

        System.out.println("\n Find duplicates by Using Stream.filter() and Collections.frequency() methods \n");

        List<String> companies1 = new ArrayList<String>();
        companies1.add("Meta");
        companies1.add("Apple");
        companies1.add("Amazon");
        companies1.add("Netflix");
        companies1.add("Meta"); // duplicate
        companies1.add("Google");
        companies1.add("Apple");

        Set<String> collect = companies1.stream()
                .filter(company -> Collections.frequency(companies1, company) > 1)
                .collect(Collectors.toSet());

        collect.forEach(System.out::println);

        System.out.println("\n Find duplicates by Using Stream.filter() and Set.add() methods \n");

        List<String> companies2 = new ArrayList<String>();
        companies2.add("Meta");
        companies2.add("Apple");
        companies2.add("Amazon");
        companies2.add("Netflix");
        companies2.add("Meta");
        companies2.add("Google");
        companies2.add("Apple");

        Set<String> set = new HashSet<>();
        companies2.stream().filter(company -> !set.add(company)).forEach(System.out::println);

        System.out.println("\n Find duplicates by Using Collectors.toMap() and Math::addExact \n");

        List<String> companies3 = new ArrayList<String>();// 1.1 add string elements to List
        companies3.add("Meta");
        companies3.add("Apple");
        companies3.add("Amazon");
        companies3.add("Netflix");
        companies3.add("Meta");
        companies3.add("Google");
        companies3.add("Apple");

        Map<String, Integer> duplicateCountMap = companies3.stream().collect(Collectors.toMap(
                Function.identity(), company -> 1, Math::addExact
        ));

        duplicateCountMap.forEach((key, value) -> {
            System.out.println("Key : " + key + "\t Value : " + value);
        });

        System.out.println("\n Find duplicates by Using Collectors.toMap() and Integer::sum \n");

        List<String> companies4 = new ArrayList<String>();
        companies4.add("Meta");
        companies4.add("Apple");
        companies4.add("Amazon");
        companies4.add("Netflix");
        companies4.add("Meta");
        companies4.add("Google");
        companies4.add("Apple");

        Map<String, Integer> collect1 = companies4.stream().collect(Collectors.toMap(
                Function.identity(), company -> 1, Integer::sum
        ));

        collect1.forEach((key, value) -> System.out.println("Key : " + key + "\t Value : " + value));

        System.out.println("\n Find duplicates by Using Collectors.toMap() and Long::sum \n");

        List<String> companies5 = new ArrayList<String>();
        companies5.add("Meta");
        companies5.add("Apple");
        companies5.add("Amazon");
        companies5.add("Netflix");
        companies5.add("Meta");
        companies5.add("Google");
        companies5.add("Apple");

        Map<String, Long> collect2 = companies5.stream().collect(Collectors.toMap(
                Function.identity(), company -> 1L, Long::sum
        ));

        collect2.forEach((key, value) -> System.out.println("Key : " + key + "\t Value : " + value));

        System.out.println("\n Find duplicates by Using Collectors.groupingBy() \n");

        List<String> companies6 = new ArrayList<String>();
        companies6.add("Meta");
        companies6.add("Apple");
        companies6.add("Amazon");
        companies6.add("Netflix");
        companies6.add("Meta");
        companies6.add("Google");
        companies6.add("Apple");

        Map<String, Long> collect3 = companies6
                .stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        Function.identity(), Collectors.counting()
                                ));

        collect3.forEach((key, value) -> System.out.println("Key : " + key + "\t Value : " + value));

        System.out.println("\n get duplicate elements \n");

        Set<String> collect4 = companies6
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        collect4.forEach(System.out::println);

        System.out.println("\n Find duplicates by Using merge() \n");

        List<String> companies7 = new ArrayList<String>();
        companies7.add("Meta");
        companies7.add("Apple");
        companies7.add("Amazon");
        companies7.add("Netflix");
        companies7.add("Meta");
        companies7.add("Google");
        companies7.add("Apple");

        Map<String, Integer> duplicateMap = new HashMap<>();

        companies7.forEach(company -> duplicateMap.merge(company, 1, (a,b) -> a + b));
        System.out.println("\n2. Map with Key and its duplicate count : \n");
        System.out.println(duplicateMap);

        Map<String, Integer> duplicateMap1 = new HashMap<>();

        System.out.println("\n3. Map with Key and its duplicate count by using merge() and Integer::sum : \n");
        companies7.forEach(company -> duplicateMap1.merge(company, 1, Integer::sum));
        System.out.println(duplicateMap1);
    }

}
