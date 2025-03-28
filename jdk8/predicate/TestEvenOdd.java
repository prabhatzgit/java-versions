package jdk8.predicate;

import java.util.function.Predicate;

public class TestEvenOdd {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		// testing number using Predicate
		System.out.println("1. Whether number 10 is even/odd \t: " + predicate.test(10));

		System.out.println("2. Whether number 5 is even/odd \t: " + predicate.test(5));

		System.out.println("3. Whether number 1992 is even/odd \t: " + predicate.test(1992));

		System.out.println("4. Whether number 9753 is even/odd \t: " + predicate.test(9753));

		System.out.println("5. Whether number 2020 is even/odd \t: " + predicate.test(10));
	}

}