package jdk8.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String name = "Hi Hello Java";
        // count the letters which are used more than one time
        Map<String, Long> countLetter = Arrays
                .stream(name.replaceAll("\\s+", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(countLetter);

        String input = "Prabhat";
        Map<Character, Long> collectCharacter = input
                .chars()
                .mapToObj(chars -> (char) chars)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collectCharacter);
    }
}
