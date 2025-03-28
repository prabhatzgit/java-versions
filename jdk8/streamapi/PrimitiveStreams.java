package jdk8.streamapi;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        Stream<Integer> integerStream = Arrays.stream(numbers);

        int[] numbersInt = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(numbersInt);
        // if omit boxed(), exception will occur
        // boxed() : a Stream consistent of the elements of this stream, each boxed to an Integer
        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList()));

        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.boxed().collect(Collectors.toList()));

        IntStream ints = new Random().ints(5);
        System.out.println(ints.boxed().collect(Collectors.toList()));

    }
}
