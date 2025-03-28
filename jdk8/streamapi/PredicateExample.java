package jdk8.streamapi;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
       Predicate<Integer> isEven = x -> x % 2 == 0;
       System.out.println(isEven.test(2));
       Predicate<String> isWordStartingWithA = x -> x.startsWith("a");
       System.out.println(isWordStartingWithA.test("a"));
       Predicate<String> isWordEndingWithT = x -> x.endsWith("t");
       System.out.println(isWordEndingWithT.test("t"));
       Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
       System.out.println(and.test("ankit"));

    }
}
