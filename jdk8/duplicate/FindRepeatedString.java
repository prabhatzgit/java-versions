package jdk8.duplicate;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedString {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        Arrays.stream(strings)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
