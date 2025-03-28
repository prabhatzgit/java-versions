package jdk8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Stream - feature in Java 1.8
        // helps to process collection of data in a functional and declarative programming
        // simplify data processing
        // Embrace functional programming
        // Improve Readability and Maintainability
        // Enable easy parallelism

        // What is Stream?
        // a sequence of elements supporting functional and declarative programming

        // How to use Stream?
        // Source, intermediate operations & terminal operation
        List<Integer> numberList = Arrays.asList(1,2,3,4,5);
        // numberList : source and this source I want to process collection of data of
        // numberList in a functional and declarative programming
        long count = numberList.stream().filter(x -> x % 2 == 0).count();
        System.out.println(count);

        // creating stream from
        // 1. collection
        Stream<Integer> stream = numberList.stream();
        // 2. array
        String[] stringArray = {"A","B","C","D","E","F"};
        Stream<String> streamArray = Arrays.stream(stringArray);
        // 3. using Stream.of()
        Stream<String> streamOf = Stream.of("a","b","c","d","e","f");
        // 4. create infinite stream
        Stream<Integer> generateInfiniteStream = Stream.generate(() -> 1);
        Stream.iterate(1,x->x+1);
        // 4. create infinite stream
        Stream<Integer> generateLimitStream = Stream.generate(() -> 1).limit(10);
        // 5. another way to create infinite stream
        Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList()).forEach(System.out::println);
    }
}