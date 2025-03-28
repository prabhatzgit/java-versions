package jdk8.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemoval {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("JavaJavaEEgfm", "JavaJavaEEgfm", "Java", "EEgfm", "Python", "Java");

        // Remove duplicates using distinct() and collect()
        List<String> uniqueStrings = strings.stream()
                                           .distinct()
                                           .collect(Collectors.toList());

        // Print the unique strings
        System.out.println("Unique Strings:");
        uniqueStrings.forEach(System.out::println);
    }
}