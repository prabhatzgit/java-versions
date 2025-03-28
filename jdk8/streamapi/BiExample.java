package jdk8.streamapi;

import java.util.function.*;

public class BiExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a+b) /2 == 0;
        System.out.println(biPredicate.test(2, 2));
        BiConsumer<Integer, String> biConsumer = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
        };
        BiFunction<String, String, Integer> biFunction = (a, b) -> (a+b).length();
        System.out.println(biFunction.apply("abc", "def"));

        UnaryOperator<Integer> unaryOperator = (a) -> a*2;
        System.out.println(unaryOperator.apply(2));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
        System.out.println(binaryOperator.apply(2, 2));
    }
}
