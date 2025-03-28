package jdk8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Blank stream
        Stream<Object> emptyStream = Stream.empty();
        //emptyStream.forEach(e -> System.out.println(e));
        emptyStream.forEach(System.out::println);
        // array, object, collection
        String names[] = {"Durgesh", "Uttam", "Ankit", "Dev"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(System.out::println);

        // builder
        Stream<Object> streamBuilder = Stream.builder().build();
        streamBuilder.forEach(System.out::println);

        IntStream stream2 = Arrays.stream(new int[]{2,4,65,3,564});
        stream2.forEach(e -> System.out.println(e));

        // List, Collection, Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);
        list2.stream().forEach(System.out::println);
    }
}
