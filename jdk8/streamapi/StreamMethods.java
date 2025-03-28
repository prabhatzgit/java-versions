package jdk8.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        // filter (Predicate)
        // boolean valued function

        // map(Function) --> each element operation
        List<String> names = List.of("Ankit","Aman","Abhinav", "Durgesh");
        List<String> namesStartsWithA = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(namesStartsWithA);

        List<Integer> numbers = List.of(23, 4, 2, 5, 7, 4);
        numbers.stream().map(i -> i*i).collect(Collectors.toList()).forEach(System.out::println);
    }
}
