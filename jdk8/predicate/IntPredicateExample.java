package jdk8.predicate;

import java.util.function.IntPredicate;

public class IntPredicateExample {

	public static void main(String[] args) {
		IntPredicate intPredicate = i -> i % 2 == 0;
		// testing for different numbers using above lambda expression
		System.out.println("1. Whether 10 is even number : " + intPredicate.test(10));

		System.out.println("2. Whether 7 is even number : " + intPredicate.test(7));

		System.out.println("3. Whether 19 is even number : " + intPredicate.test(19));

		System.out.println("4. Whether 32 is even number : " + intPredicate.test(32));

		System.out.println("5. Whether 41 is even number : " + intPredicate.test(41));

	}

}