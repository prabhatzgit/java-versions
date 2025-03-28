package jdk8.streamapi;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x -> x *2;
        Function<Integer, Integer> tripleIt = x -> x *4;
        System.out.println(doubleIt.apply(100));
        // operation in andThen : doubleIt first and then tripleIt
        System.out.println(doubleIt.andThen(tripleIt).apply(100));
        System.out.println(tripleIt.andThen(doubleIt).apply(100)); // same
        System.out.println(doubleIt.compose(tripleIt).apply(100)); // same
        Function<Integer, Integer> identity = Function.identity();
        Integer response = identity.apply(5);
        System.out.println(response);
    }
}
