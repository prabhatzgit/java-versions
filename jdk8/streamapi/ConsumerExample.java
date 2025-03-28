package jdk8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer : Consume one argument and doesn't return anything
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(10);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x -> x.forEach(System.out::println);
        printList.accept(list);

        // Supplier : it doesn't take any argument and return an argument
        Supplier<String> givenString = () -> "Hello World";
        System.out.println(givenString.get());

        // Combined
        Predicate<Integer> predicate = x -> x %2 == 0;
        Function<Integer, Integer> function = x -> x*x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 10;
        if(predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }
    }
}
