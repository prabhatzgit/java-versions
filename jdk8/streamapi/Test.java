package jdk8.streamapi;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 4, 6, 8, 9, 10);
        // >4 -> 23, 6, 8, 9, 10 // 6, 8, 9, 10, 23
        list.stream().filter(t -> t > 4).sorted().forEach(System.out::println);
    }
}
