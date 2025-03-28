package jdk8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // create a list and filter all the even numbers
        List<Integer> list1 = List.of(2,4,50,21,22,67);
        // list1.add(55); at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)

        List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);
        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        list1.stream().filter(i -> i > 10).collect(Collectors.toList()).forEach(System.out::print);
    }
}
